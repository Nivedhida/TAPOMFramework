package org.salesforce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.salesforce.Base.BasePage;

public class SFLoginPage extends BasePage{

//Locators
	
	@FindBy (id="idcard-identity") WebElement userNameTextEle;
	@FindBy (id="password") WebElement passwordTextEle;
	@FindBy (id="Login") WebElement loginButtonEle;
	@FindBy (id="rememberUn") WebElement rememberMeCheckboxEle;
	@FindBy (id="forgot_password_link") WebElement forgotPasswordLinkEle;
	@FindBy (id="signup_link") WebElement signUpButtonEle;
	
	
	
	
	public void enterUserName() {
		sendTextInput(userNameTextEle, getUserName());
	}
	
	public void enterPassword() {
		sendTextInput(passwordTextEle, getPassword());
	}
	
	public void clickLoginButton() {
		clickElement(loginButtonEle);
	}
	
	public void clickForgotPasswordLink() {
		clickElement(forgotPasswordLinkEle);
	}
	
	public void checkRememberMeCheckBox() {
		clickElement(rememberMeCheckboxEle);
	}
}
