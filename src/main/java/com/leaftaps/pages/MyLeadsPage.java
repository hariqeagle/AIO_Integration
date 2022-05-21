package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class MyLeadsPage extends ProjectSpecificMethods {

	
	
	
	// Click Create Leads 
	public CreateLeadPage clickCreateLead(){
		click(locateElement(Locators.LINK_TEXT,"Create Lead"));
		return new CreateLeadPage();
	}

	
	
	public FindLeadPage clickFindLead(){
		click(locateElement(Locators.LINK_TEXT,"Find Leads"));	
		return new FindLeadPage();
	}
	
	
	
	public MergeLeadPage clickMergeLead(){
		click(locateElement(Locators.LINK_TEXT,"Merge Leads"));	
		return new MergeLeadPage();
	}
	
	

}
