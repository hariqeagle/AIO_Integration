package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.FindLeadPage;
import com.leaftaps.pages.LoginPage;

public class TC005_DeleteLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setData() {
		testcaseName = "TC005_DeleteLead";
		testDescription = "Delete a Lead - LeafTaps";
		excelFileName = "TC005";
		category = "Sanity";
		authors = "Hari";
	}

	@Test(dataProvider = "fetchData")
	public void deleteLead(String userName, String password, String phoneNum, String errorMsg) {

		String firstResultingLead = new LoginPage().enterUserName(userName).enterPassword(password).clickLogin()
				.clickCRMSFA().clickLeadLink().clickFindLead().clickPhoneTab().enterPhoneNumberField(phoneNum)
				.clickFindleadsButton().getFirstResultingLead();

		new FindLeadPage().clickFirstResultingLead().clickDeleteLeadLink().clickFindLead()
				.enterLeadId(firstResultingLead).clickFindleadsButton().verifyErrorMsg(errorMsg);
	}
}
