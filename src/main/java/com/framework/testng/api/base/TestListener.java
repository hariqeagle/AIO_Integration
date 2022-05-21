package com.framework.testng.api.base;

import org.apache.commons.lang.exception.ExceptionUtils;

import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestResult;

import com.framework.utils.JiraCreateIssue;

import com.framework.utils.JiraServiceProvider;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		boolean islogIssue = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraCreateIssue.class).isCreateIssue();
		
		if (islogIssue){
			//url, username, api token and project key
			JiraServiceProvider jsp = new JiraServiceProvider("https://api-training.atlassian.net/","hari.radhakrishnan@testleaf.com","8kd8oZs0NhvMDlwNpFU240E9","LD");
			String issueDescription = "Failure Reason from Automation Testing\n\n"+result.getThrowable().getMessage()+"\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod()+"Failed in Automation Testing";
			jsp.createJiraIssue("Bug",issueSummary,issueDescription,"Automated Testing");
		}

			

	}
}