Feature: This is to test Google search
Scenario: Google search scenario
	Given user is entering google.co.in
	When User types the term "Chandler"
	And press the enter key
	Then The search results for chandler should appear on screen