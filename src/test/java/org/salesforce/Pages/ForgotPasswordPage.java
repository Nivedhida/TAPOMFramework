package org.salesforce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {

//Locators	
	
	@FindBy (id="un") WebElement FPUsernameTextEle;
	@FindBy (id="continue") WebElement continueButtonEle;
	@FindBy (xpath="//input[@class='secondary button fiftyfifty mb16']") WebElement cancelButtonEle;
	
//Actions
	
	public void enterUserName(String username) {
		
	}
	
	public void clickContinueButton() {
		
	}
	
	public void clickCancelButton() {
		
	}
}
