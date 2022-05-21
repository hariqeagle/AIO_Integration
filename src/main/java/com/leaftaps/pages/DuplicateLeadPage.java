package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage clickCreateLeadDublicate(){
		click(locateElement(Locators.CLASS_NAME,"smallSubmit"));
		return new ViewLeadPage();
	}
}
