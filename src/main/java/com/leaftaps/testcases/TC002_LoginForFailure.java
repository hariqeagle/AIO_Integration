package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class TC002_LoginForFailure extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {

		testcaseName = "Login(Negative)";
		testDescription = "Login for Failure(Negative testCase)";
		authors = "Hari";
		category = "Smoke";
		excelFileName = "TC002";

	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd, String errMsg) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);
	}


}





