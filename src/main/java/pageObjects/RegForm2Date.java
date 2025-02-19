package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm2Date extends BasePage {

	public WebDriver driver;
	
	By dayField = By.cssSelector("#day");
	By monthField = By.cssSelector("select#month");
	By yearField = By.cssSelector("#year");
	By genderField = By.cssSelector("select#gender");
	By continueBtn = By.cssSelector(".VfPpkd-vQzf8d");
	
	
	public RegForm2Date() throws IOException {
		super();
	}
	
	public WebElement getDayField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(dayField);
	}
	
	public WebElement getMonthField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(monthField);
	}
	
	public WebElement getYearField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(yearField);
	}

	public WebElement getGenderField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(genderField);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	
}
