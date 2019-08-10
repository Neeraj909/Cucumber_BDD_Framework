Feature: Free CRM login Feature
#@SmokeTest1
#Scenario: Free CRM login test Scenario
#without example keyword
#Given User is already on Login page
#When Title of login page is free CRM 
#Then user enters "neeraj123" and  "Test@123"
#Then user clicks on login button
#Then user is on Home page
#Then close the browser

#with example keyword
Scenario Outline: Free CRM login test Scenario

Given User is already on Login page
When Title of login page is free CRM 
Then user enters "<username>" and  "<pass>"
Then user clicks on login button
Then user is on Home page
Then close the browser

Examples: 
      | username | pass |
      | neeraj123| Test@123|
      |   tom   | test456 |