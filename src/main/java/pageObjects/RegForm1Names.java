package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm1Names extends BasePage {

	public WebDriver driver;
	
	By firstNameField = By.cssSelector("#firstName");
	By lastNameField = By.cssSelector("#lastName");
	By continueBtn = By.cssSelector(".VfPpkd-vQzf8d");

	
	public RegForm1Names() throws IOException {
		super();
	}
	
	public WebElement getFirstNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(lastNameField);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
}
