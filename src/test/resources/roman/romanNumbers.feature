Feature: Converting a number to a Roman numeral equivalent

Scenario: Converting a valid integer into its Roman value
	Given I have a valid number
	When I convert
	Then the Roman equivalent should should be output