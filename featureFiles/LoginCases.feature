Feature: Login Feature for webpage
Scenario: Login scenarios for webpages
	Given User has navigated to Login page
	When User enters the valid username and password
	And Clicks on login button
	Then User will be able to see the home page