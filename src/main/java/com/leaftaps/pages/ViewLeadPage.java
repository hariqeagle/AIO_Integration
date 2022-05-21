package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class ViewLeadPage extends ProjectSpecificMethods  {

	
	
	public ViewLeadPage verifyFirstName(String fname) {
		verifyPartialText(locateElement(Locators.ID,"viewLead_firstName_sp"), fname);
		return this;
	}
	
	
	public FindLeadPage clickFindLead(){
		click(locateElement(Locators.LINK_TEXT,"Find Leads"));
		return new FindLeadPage();
	}
	
	
	public ViewLeadPage verifyCompanyName(String CompanyName) {
		verifyPartialText(locateElement(Locators.ID,"viewLead_companyName_sp"), CompanyName);
		return this;
	}
	
	public EditLeadPage clickEditLeadLink(){
		click(locateElement(Locators.LINK_TEXT,"Edit"));
		return new EditLeadPage();
	}
	
	public DuplicateLeadPage clickDuplicateLeadLink(){
		click(locateElement(Locators.LINK_TEXT,"Duplicate Lead"));
		return new DuplicateLeadPage();
	}
	
	public MyLeadsPage clickDeleteLeadLink(){
		click(locateElement(Locators.LINK_TEXT,"Delete"));
		return new MyLeadsPage();
	}
	
	

	
	
}
