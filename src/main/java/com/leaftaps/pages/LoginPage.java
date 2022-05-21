package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	
	public LoginPage enterUserName(String data) {	
		clearAndType(locateElement(Locators.ID,"username"), data);
		return this;
	}	

	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.ID,"password"), data);
		return this;
	}	

	public HomePage clickLogin() {
		click(locateElement(Locators.CLASS_NAME,"decorativeSubmit"));
		return new HomePage();		
	}
	
	public LoginPage clickLogInForFailer() {
		click(locateElement(Locators.CLASS_NAME,"decorativeSubmit"));
		return this;		
	}
	
	
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement(Locators.ID,"errordiv"), data);
		return this;
	}
	
	
}
