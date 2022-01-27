$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/LoginParameterization.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature for webpage",
  "description": "",
  "id": "login-feature-for-webpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login scenarios for webpages",
  "description": "",
  "id": "login-feature-for-webpage;login-scenarios-for-webpages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User has navigated to Login page correctly",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters the valid username \"Admin\" and password \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User will be able to see the welcome page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginParameterization.user_has_navigated_to_Login_page_correctly()"
});
formatter.result({
  "duration": 61018372400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 32
    },
    {
      "val": "admin123",
      "offset": 53
    }
  ],
  "location": "LoginParameterization.user_enters_the_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 208569400,
  "status": "passed"
});
formatter.match({
  "location": "LoginParameterization.click_on_the_login_button()"
});
formatter.result({
  "duration": 14033216400,
  "status": "passed"
});
formatter.match({
  "location": "LoginParameterization.user_will_be_able_to_see_the_welcome_page()"
});
formatter.result({
  "duration": 59437000,
  "status": "passed"
});
});