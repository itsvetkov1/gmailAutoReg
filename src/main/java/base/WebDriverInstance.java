package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class WebDriverInstance {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		if (driver.get() == null) {
			try {
				driver.set(createDriver());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return driver.get();
	}
	
	public static WebDriver createDriver() throws IOException {
		WebDriver driver = null;
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resourses\\config.properties");
				prop.load(data);
				
				if(prop.getProperty("browser").equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", 
							System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
					 driver = new ChromeDriver();
				}
				else if(prop.getProperty("browser").equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", 
							System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
					 driver = new FirefoxDriver();
				}
				else if(prop.getProperty("browser").equals("opera")) {
					System.setProperty("webdriver.opera.driver", 
							System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\operadriver.exe");
					 String operaProfilePath = "C:\\Users\\i_tsvetkov\\AppData\\Roaming\\Opera Software\\Opera Stable";
					    
					    OperaOptions options = new OperaOptions();
					    options.addArguments("user-data-dir=" + operaProfilePath);
					 driver = new OperaDriver(options);
				}
				else {
					System.setProperty("webdriver.edge.driver", 
							System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\msedgedriver.exe");
					 driver = new EdgeDriver();
				}		
				driver.manage().window().maximize();
				
				return driver;
	}
	
	public static void cleanupDriver() {
		driver.get().quit();
		driver.remove();
	}

}
