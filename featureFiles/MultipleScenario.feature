@multiple
Feature: Login Feature for webpage
@Positive
Scenario: Valid Login or positive scenario
	Given User has navigated to Login page
	When User enters the valid username and password
	And Clicks on login button
	Then User will be able to see the home page
	
@Negative	
Scenario: Invalid Login or negative
	Given User has navigated to Login page
	When User enters the invalid username and password
	And Clicks on login button
	Then User will not be able to see the home page