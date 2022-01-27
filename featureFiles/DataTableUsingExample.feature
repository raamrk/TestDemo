Feature: Login Feature for table using Example
Scenario Outline:: Login scenarios for table using Example
	Given User has navigated to the required page 
	When User enters "<Username>" and "<Password>"
	And Click the submit button
	
Examples:
|Username|Password|
|Admin   |admin123|