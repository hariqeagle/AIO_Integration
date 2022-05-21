package com.framework.utils;

import net.rcarz.jiraclient.*;
import net.rcarz.jiraclient.Issue.*;

public class JiraServiceProvider {


     private JiraClient Jira;

     private String project;

     private String JiraUrl;

     public JiraServiceProvider(String JiraUrl, String username, String password, String project) {

         this.JiraUrl=JiraUrl;

         // create basic authentication object

         BasicCredentials creds = new BasicCredentials(username, password);

         // initialize the Jira client with the url and the credentials

         Jira = new JiraClient(JiraUrl, creds);

         this.project = project;

     }


    public void createJiraIssue(String issueType, String summary, String description, String reporterName) {




        try {

            //Avoid Creating Duplicate Issue

            Issue.SearchResult sr = Jira.searchIssues("summary ~ \""+summary+"\"");

            if(sr.total!=0) {

                System.out.println("Same Issue Already Exists on Jira");

                return;

            }

            

            //Create issue if not exists

            FluentCreate fleuntCreate = Jira.createIssue(project, issueType);

            fleuntCreate.field(Field.SUMMARY, summary);

            fleuntCreate.field(Field.DESCRIPTION, description);

            Issue newIssue = fleuntCreate.execute();

            System.out.println("********************************************");

            System.out.println("New issue created in Jira with ID: " + newIssue);

            System.out.println("New issue URL is :"+JiraUrl+"/browse/"+newIssue);

            System.out.println("*******************************************");

        } catch (JiraException e) {

            e.printStackTrace();

        }

    }

}
