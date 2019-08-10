$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/11017/workspace/Cucumebrframework/src/main/java/Feature/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM login test Scenario",
  "description": "without example keyword",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and  pass",
  "rows": [
    {
      "cells": [
        "neeraj123",
        "Test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user move new Deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters deals details",
  "rows": [
    {
      "cells": [
        "testdael",
        "100",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_already_on_login_page()"
});
formatter.result({
  "duration": 18242269900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.Title_of_login_page()"
});
formatter.result({
  "duration": 82522600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_username_and_pass(DataTable)"
});
formatter.result({
  "duration": 622769300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3613356000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 11036300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_move_new_Deals_page()"
});
formatter.result({
  "duration": 3749481200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 555479200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "duration": 200068501,
  "status": "passed"
});
});