package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm9Terms extends BasePage {

	public WebDriver driver;
	
	
	By continueBtn = By.cssSelector("[jsname] .fIPjt:nth-of-type(2) .VfPpkd-vQzf8d");
	
	public RegForm9Terms() throws IOException {
		super();
	}
	
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	

	
}
