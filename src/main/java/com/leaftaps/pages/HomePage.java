package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyLoggedName(String data) {
		verifyPartialText(locateElement(Locators.XPATH, "//h2[text()[contains(.,'Demo')]]"), data);
		return this;
	}

	public MyHomePage clickCRMSFA() {
		click(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		return new MyHomePage();
	}

	public LoginPage clickLogout() {
		click(locateElement(Locators.CLASS_NAME, "decorativeSubmit"));
		return new LoginPage();

	}

	
	public HomePage verifyHomepage() {
		verifyDisplayed(locateElement(Locators.LINK_TEXT, "CRM/SFA"));
		return this;
	}

}
