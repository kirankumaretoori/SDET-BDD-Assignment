Feature: Validate OrangeHRP Page
Background: Initialize the browser
Given the user opens the browser
Then the user runs the URL


@SmokeTest @RegressionalTest
Scenario: Login to OrangeHRP
Given I am in OrangeHRP Application
Then Login to Application 
When Dashboard page is available 
And click on Admin menu
Then Close the browser

@RegressionalTest
Scenario: I am logged into Orange Application. 
Given I am in OrangeHRP Application
Then Login to Application 
Then click on Admin menu
Then Click on Job 
And validate text – Job Title
Then Close the browser

 @SmokeTest
 Scenario: I am logged into Orange Application. 
Given I am in OrangeHRP Application
Then Login to Application 
Then click on PIM menu
 And validate User in PIM Menu
Then Close the browser


 @SmokeTest @RegressionalTest
 Scenario: I am logged into Orange Application. 
Given I am in OrangeHRP Application
Then Login to Application 
Then click on Time menu
 And validate User in Time Menu
Then Close the browser