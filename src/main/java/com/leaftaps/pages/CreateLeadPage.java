package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class CreateLeadPage extends ProjectSpecificMethods {


	
	public CreateLeadPage enterCompanyName(String comnyName){
		clearAndType(locateElement(Locators.ID,"createLeadForm_companyName"), comnyName);
		return this;

	}

	

	public CreateLeadPage enterFirstName(String firstName){
		clearAndType(locateElement(Locators.ID,"createLeadForm_firstName"), firstName);
		return this;
	}


	public CreateLeadPage enterLastName(String lastName){
		clearAndType(locateElement(Locators.ID,"createLeadForm_lastName"), lastName);
		return this;

	}

	
	public ViewLeadPage clickCreateLeadSubmit(){
		click(locateElement(Locators.CLASS_NAME,"smallSubmit"));
		return new ViewLeadPage();
	}
	
	
	public CreateLeadPage enterEmail(String eMail){
		clearAndType(locateElement(Locators.ID,"createLeadForm_primaryEmail"), eMail);
		return this;
	}
}
