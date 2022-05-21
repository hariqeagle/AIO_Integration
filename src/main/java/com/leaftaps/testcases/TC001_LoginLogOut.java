package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.framework.utils.JiraCreateIssue;

public class TC001_LoginLogOut extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testcaseName = "Login and LoginOut";
		testDescription = "Login testCase using DemoSalesManager UserName and LogOut";
		authors = "Hari";
		category = "Smoke";
		excelFileName = "TC001";
	}

	@JiraCreateIssue(isCreateIssue=true)
	@Test(dataProvider = "fetchData")
	public void loginAndLogout(String uName, String pwd) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogout();		
	}


}





