Feature: Functionality of Login page

#Background:
#Given Open the browser
#Given Load the Url

@smoke @regression
Scenario Outline: Login with Positive credentials

When Enter the Username as <username>
And Enter the Password as <password>
When Clicking the Login button
Then Verify the homepage
#Then click CRMSFA link

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Sanity
Scenario: Login with Negative credentials
When Enter the Username as 'DemosalesManager'
When Enter the Password as 'crmsfa1'
When Clicking the Login button
But Error message is displayed
