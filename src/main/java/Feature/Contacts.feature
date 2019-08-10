Feature: Free CRM Create Contact

Scenario Outline: Free CRM create a new conatct  Scenario
Given user is already on login page
When titel is login page is free CRM
Then user enters "<username>" and  "<pass>"
Then user clicks on login button
Then user is on home page
Then user move new contact page
Then user enters contact "<firstname>" and  "<lastname>" and "<position>"
Then close the browser

Examples: 
      | username | pass | firstname | lastname | position |
      | neeraj123|Test@123| ani| lok| se|
      |neeraj123| Test@123| anisha| ella | dev|
