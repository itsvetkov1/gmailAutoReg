package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.*;



public class AppTest extends Hooks {

	public AppTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	By ipAddress = By.cssSelector(".address > a");
	
	@Test
	
	public void test() throws IOException, InterruptedException {
		Thread.sleep(2000);
		getDriver().get("https://whatismyipaddress.com/");
		
		getDriver().findElement(By.cssSelector(".css-47sehv > span")).click();
		
		String currentIpAddress = getDriver().findElement(ipAddress).getText();
		
		if (currentIpAddress.equals("87.227.177.2")) {
		    System.out.println("no vpn");
		} else {
		    System.out.println(currentIpAddress);
		}
		
	}
	
	
	
}



