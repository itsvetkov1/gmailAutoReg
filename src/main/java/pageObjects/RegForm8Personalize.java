package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm8Personalize extends BasePage {

	public WebDriver driver;
	
	By expressPersonalizationRBtn = By.cssSelector("div:nth-of-type(1) > .STFd6.sSzDje.zVkt0c > .enBDyd > div[role='radio']  .Id5V1.t5nRo");
	By continueBtn = By.cssSelector(".VfPpkd-RLmnJb");
	
	public RegForm8Personalize() throws IOException {
		super();
	}
	
	public WebElement getExpressPersonalizationRBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(expressPersonalizationRBtn);
	}
	
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueBtn);
	}
	

	
}
