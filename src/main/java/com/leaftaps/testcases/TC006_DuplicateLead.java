package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.FindLeadPage;
import com.leaftaps.pages.LoginPage;


public class TC006_DuplicateLead extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		testcaseName="TC006_DuplicateLead";
		testDescription="Duplicate a Lead - LeafTaps";
		excelFileName="TC006";
		category="Regression";
		authors="Hari";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password ,String emailAddress) throws InterruptedException{

		String fName=
			new LoginPage()
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()		
				.clickCRMSFA()		
				.clickLeadLink()		
				.clickFindLead()
				.clickEmailTab()
				.enterEmailAddress(emailAddress)
				.clickFindleadsButton()
				.getFirstResultingFirstName();
			new FindLeadPage()
				.clickFirstResultingLead()
				.clickDuplicateLeadLink()
				.clickCreateLeadDublicate()
				.verifyFirstName(fName);

	}

}
