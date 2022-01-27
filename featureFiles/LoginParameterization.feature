Feature: Login Feature for webpage
Scenario: Login scenarios for webpages
	Given User has navigated to Login page correctly
	When User enters the valid username "Admin" and password "admin123"
	And Click on the login button
	Then User will be able to see the welcome page