Feature: Login Feature for table without header
Scenario: Login scenarios for table without header
	Given User has navigated to correct Login page 
	When User enters the valid credentials
	|Admin|admin123|
	And Click the login button
	