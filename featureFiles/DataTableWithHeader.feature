Feature: Login Feature for table with header
Scenario: Login scenarios for table with header
	Given User has navigated to the correct page 
	When User enters the valid credentials from datatable with header
	|Username|Password|
	|Admin   |admin123|
	And Click the login or submit button
	