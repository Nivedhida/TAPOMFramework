package org.salesforce.TestScripts;

import org.salesforce.Pages.SFLoginPage;
import org.testng.annotations.Test;

public class TestScript {
	
	SFLoginPage login = new SFLoginPage();
	
	@Test
	public void loginErrorMsg1() {
		
		//login.enterUserName();
		login.clickLoginButton();
		
	}

	public void loginToSalesForce() {
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
	}
	
	public void checkRememberMe () {
		
	}
	
	public void forgotPassword () {
		
	}
	
	public void forgotPasswordB () {
		
	}
}


