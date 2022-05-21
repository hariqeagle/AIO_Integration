package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class FindLeadPopPage extends ProjectSpecificMethods {


	
		public FindLeadPopPage enterFirstName(String findfistname){
		clearAndType(locateElement(Locators.NAME,"firstName"), findfistname);
		return this;

	}
	
	public FindLeadPopPage clickFindleadsButton(){
		click(locateElement(Locators.XPATH,"//button[text()='Find Leads']"));
		return this;
	}
	
	public String getFirstResultingLead(){	
		switchToWindow(1);

		return getElementText(locateElement(Locators.XPATH,"(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}

	
	public MergeLeadPage clickResultingLeads(){
		clickWithNoSnap(locateElement(Locators.XPATH,"(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);
		return new MergeLeadPage();
	}
}