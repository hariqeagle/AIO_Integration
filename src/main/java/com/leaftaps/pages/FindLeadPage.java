package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods {

	public FindLeadPage enterFirstName(String findfistname) {
		clearAndType(locateElement(Locators.XPATH, "(//input[@name='firstName'])[3]"), findfistname);
		return this;

	}

	public FindLeadPage enterLeadId(String findfistname) {
		clearAndType(locateElement(Locators.NAME, "id"), findfistname);
		return this;

	}

	public FindLeadPage clickFindleadsButton() {
		click(locateElement(Locators.XPATH, "//button[text()='Find Leads']"));
		return this;
	}

	public String getFirstResultingLead() {
		return getElementText(
				locateElement(Locators.XPATH, "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}

	public String getFirstResultingFirstName() throws InterruptedException {
		Thread.sleep(1000);
		return getElementText(locateElement(Locators.XPATH, "//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']"));
	}

	public ViewLeadPage clickFirstResultingLead() {
		click(locateElement(Locators.XPATH, "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		return new ViewLeadPage();
	}

	public FindLeadPage clickPhoneTab() {
		click(locateElement(Locators.XPATH, "//span[text()='Phone']"));
		return this;
	}

	public FindLeadPage clickEmailTab() {
		click(locateElement(Locators.XPATH, "//span[text()='Email']"));
		return this;
	}

	public FindLeadPage enterPhoneNumberField(String PhoneNumber) {
		clearAndType(locateElement(Locators.NAME, "phoneNumber"), PhoneNumber);
		return this;
	}

	public FindLeadPage enterEmailAddress(String emailAddress) {
		clearAndType(locateElement(Locators.NAME, "emailAddress"), emailAddress);
		return this;
	}

	public FindLeadPage verifyErrorMsg(String eleErrorMsgValue) {
		verifyPartialText(locateElement(Locators.CLASS_NAME, "x-paging-info"), eleErrorMsgValue);
		return this;
	}

}