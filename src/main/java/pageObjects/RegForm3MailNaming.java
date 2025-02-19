package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class RegForm3MailNaming extends BasePage {

	public WebDriver driver;
	
	
	By firstChoiceNamingRBtn = By.cssSelector("[jscontroller] [jsaction='click\\:DKv26d\\;RXQi4b\\:\\.CLIENT\\;TGB85e\\:\\.CLIENT']:nth-of-type(1) .Id5V1");
	By secondChoiceNamingRBtn = By.cssSelector("[jscontroller] [jsaction='click\\:DKv26d\\;RXQi4b\\:\\.CLIENT\\;TGB85e\\:\\.CLIENT']:nth-of-type(2) .Id5V1");
	By createNamingRBtn = By.cssSelector("div:nth-of-type(3) > .sSzDje.zVkt0c > .enBDyd > div[role='radio']  .Id5V1.t5nRo");
	By conitnueBtn = By.xpath("//div[@id='next']//button[@type='button']/span[@class='VfPpkd-vQzf8d']");
	
	public RegForm3MailNaming() throws IOException {
		super();
	}
	
	public WebElement getFirstChoiceNamingRBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(firstChoiceNamingRBtn);
	}

	public WebElement getSecondChoiceNamingRBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(secondChoiceNamingRBtn);
	}
	
	public WebElement getCreateNamingRBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(createNamingRBtn);
	}
	
	public WebElement getConitnueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(conitnueBtn);
	}
	
}
