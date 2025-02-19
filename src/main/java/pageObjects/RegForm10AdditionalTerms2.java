package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm10AdditionalTerms2 extends BasePage {

	public WebDriver driver;
	
	
	By continueBtn = By.cssSelector(".FmFZVc .VfPpkd-vQzf8d");
	
	public RegForm10AdditionalTerms2() throws IOException {
		super();
	}
	
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	

	
}
