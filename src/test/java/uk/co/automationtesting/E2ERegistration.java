package uk.co.automationtesting;

import java.io.IOException;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import pageObjects.*;


@Listeners(resourses.Listeners.class)

public class E2ERegistration extends Hooks {

	public E2ERegistration() throws IOException {
		super();
	}
	


	@Test
	public void endToEndTest() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		
		ExtentManager.log("Starting OrderCompleteTest...");
		
		HomePage home = new HomePage();
		Thread.sleep(2000);
		home.getCreateAccount() .click();
		Thread.sleep(2000);
		
		RegForm1Names names = new RegForm1Names();
		names.getFirstNameField().sendKeys("zdazda");
		names.getLastnameField().sendKeys("zdazda");
		Thread.sleep(1000);
		names.getContinueBtn().click();
		Thread.sleep(1000);
		//wait.until(ExpectedConditions.elementToBeClickable(names.getContinueBtn())).click();
		
		RegForm2Date dates = new RegForm2Date();
		dates.getDayField().sendKeys("16");
		Thread.sleep(2000);
		Select option = new Select(dates.getMonthField());
		Thread.sleep(2000);
		option.selectByVisibleText("март");
		Thread.sleep(2000);
		dates.getYearField().sendKeys("1999");
		Thread.sleep(2000);
		Select option2 = new Select(dates.getGenderField());

		option2.selectByVisibleText("Жена");
		Thread.sleep(2000);
		dates.getContinueBtn().click();
		Thread.sleep(2000);
		
		RegForm3MailNaming naming = new RegForm3MailNaming();
		try {
			naming.getFirstChoiceNamingRBtn().click();
		} catch (IOException e) {
			naming.getSecondChoiceNamingRBtn().click();
			e.printStackTrace();
		}
		Thread.sleep(2000);
		naming.getConitnueBtn().click();
		Thread.sleep(2000);
		
		RegForm4Pass password = new RegForm4Pass();
		Thread.sleep(2000);
		password.getPasswordField().sendKeys("Kotio123@");
		password.getRepeatPasswordField().sendKeys("Kotio123@");
		Thread.sleep(2000);
		password.getContinueBtn().click();
		
		RegForm5RecoveryEmail recoveryMail = new RegForm5RecoveryEmail();
		Thread.sleep(2000);
		recoveryMail.getSkipBtn().click();
		Thread.sleep(2000);
		
		RegForm6PhoneForm phone = new RegForm6PhoneForm();
		Thread.sleep(2000);
		phone.getSkipBtn().click();
		Thread.sleep(2000);
		
		RegForm7Confirmation confirmation = new RegForm7Confirmation();
		Thread.sleep(2000);
		confirmation.getContinueBtn().click();
		Thread.sleep(2000);
		
		RegForm8Personalize personalize = new RegForm8Personalize();
		Thread.sleep(2000);
		personalize.getExpressPersonalizationRBtn().click();
		Thread.sleep(2000);
		personalize.getContinueBtn().click();
		Thread.sleep(2000);
		
		RegForm9Terms terms1 = new RegForm9Terms();
		Thread.sleep(2000);
		terms1.getContinueBtn().click();
		Thread.sleep(2000);
		
		RegForm10AdditionalTerms2 terms2 = new RegForm10AdditionalTerms2();
		Thread.sleep(2000);
		terms2.getContinueBtn().click();
		
		
}
	
}
