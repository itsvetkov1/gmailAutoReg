package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm6PhoneForm extends BasePage {
	public WebDriver driver;

	By phoneNumberField = By.cssSelector("#phoneNumberId");
	By continueBtn = By.cssSelector("#recoveryNext .VfPpkd-vQzf8d");
	By skipBtn = By.cssSelector("[jsname] .gXXtyd:nth-of-type(2) .VfPpkd-vQzf8d");
	
	

	public RegForm6PhoneForm() throws IOException {
		super();
	}

	public WebElement getPhoneNumberField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(phoneNumberField);
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
