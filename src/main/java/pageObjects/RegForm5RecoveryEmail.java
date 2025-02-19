package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm5RecoveryEmail extends BasePage {

	public WebDriver driver;

	By recoveryMailField = By.cssSelector("#recoveryEmailId");
	By continueBtn = By.cssSelector("#recoveryNext .VfPpkd-vQzf8d");
	By skipBtn = By.cssSelector("[jsname] .gXXtyd:nth-of-type(2) .VfPpkd-RLmnJb");
	
	
	public RegForm5RecoveryEmail() throws IOException {
		this.driver = getDriver();
	}

	public WebElement getRecoveryMailField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(recoveryMailField);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
	public WebElement getSkipBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(skipBtn);
	}

}
