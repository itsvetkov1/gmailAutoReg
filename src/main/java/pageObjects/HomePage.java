package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	
	By homePage = By.cssSelector(".mobile-before-hero-only");
	By createAccount = By.cssSelector(".header__aside__buttons .laptop-desktop-only");
	By signIn = By.linkText("Sign in");
	
	
	public HomePage() throws IOException{
		super();
	}
	
	
	public WebElement getHomePage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homePage);
	}
	
	public WebElement getCreateAccount() throws IOException {
		this.driver = getDriver();
		return driver.findElement(createAccount);
	}
	
	public WebElement getSignIn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signIn);
	}

	
}
