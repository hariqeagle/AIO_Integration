package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC003_CreateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testcaseName="TC003_CreateLead";
		testDescription="Create a new Lead on LeafTaps";
		excelFileName="TC003";
		category="Smoke";
		authors="Hari";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String comnyName, String firstName, String lastName, String eMail){

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()		
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(comnyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(eMail)
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);			
	}
}
