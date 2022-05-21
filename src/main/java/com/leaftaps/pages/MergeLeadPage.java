package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class MergeLeadPage extends ProjectSpecificMethods {


	
	public FindLeadPopPage clickFromLeadLookup(){
		clickWithNoSnap(locateElement(Locators.XPATH,"(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		return new FindLeadPopPage();		
	}

	
	public FindLeadPopPage clickToLeadLookup(){
		clickWithNoSnap(locateElement(Locators.XPATH,"(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		return new FindLeadPopPage();		
	}

	
	public ViewLeadPage clickMergeButton(){
		clickWithNoSnap(locateElement(Locators.LINK_TEXT,"Merge"));
		acceptAlert();
		return new ViewLeadPage();
	}
}