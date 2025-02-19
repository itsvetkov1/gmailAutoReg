package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm4Pass extends BasePage {
	public WebDriver driver;

	By passwordField = By.cssSelector(".Txuhic [jscontroller='bzud8b']:nth-of-type(1) [jsname='YPqjbf']");
	By repeatPasswordField = By.cssSelector(".Txuhic [jscontroller='bzud8b']:nth-of-type(2) [jsname='YPqjbf']");
	By continueBtn = By.cssSelector(".VfPpkd-vQzf8d");
	

	public RegForm4Pass() throws IOException {
		super();
	}

	public WebElement getPasswordField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(passwordField);
	}
	
	public WebElement getRepeatPasswordField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(repeatPasswordField);
	}

	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
}
