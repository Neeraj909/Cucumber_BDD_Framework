Feature: Free CRM login Feature

Scenario: Free CRM login test Scenario
without example keyword
Given User is already on Login page
When Title of login page is free CRM 
Then user enters username and  pass
|neeraj123|Test@123|
Then user clicks on login button
Then user is on Home page
Then user move new Deals page
Then user enters deals details
|testdael|100|50|10|
Then close the browser