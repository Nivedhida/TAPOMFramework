package org.salesforce.Base;

import org.openqa.selenium.WebElement;

public class BasePage extends BaseTest{

	
	public void sendTextInput(WebElement ele, String input) {
		
		if(ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(input);
		}
		else {
			System.out.println("Issue in entering the text");
		}
		
	}
	
	public void clickElement(WebElement ele) {
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {
			System.err.println("issue in loading the element");
		}
		
	}
	
	public void selectCheckBox(WebElement ele) {
		if(!ele.isSelected()) {
			ele.click();
		}
		else if (ele.isSelected()){
			System.out.println("element is already selected");
		}
		else {
			System.out.println("issue in loading the element");
		}
	}
	
	
}
