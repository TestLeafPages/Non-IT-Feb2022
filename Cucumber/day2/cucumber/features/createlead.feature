Feature: Functionality of CreateLead 

#Background:
#Given Open the browser
#Given Load the Url
@functional
Scenario: Creating Lead with Positive Credentials
When Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When Clicking the Login button
When Clicking the 'CRM/SFA' link
When Clicking the 'Leads' link
When Clicking the 'Create Lead' link
When Enter the company name
When Enter the first name
When Enter the last name
When Clicking the createlead button
Then ViewLead page should be displayed
