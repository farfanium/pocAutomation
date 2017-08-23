@release:1
@release:Sprint-1
Feature: Messages
	Description related to what is being tested

	@ignore @issue:POC_Messages
	Scenario: Get default message
    When I set the custom message flag to "off"
    Then I should get the message "Hello World from Cucumber!"
    
  Scenario: Get custom message
    Given I set the custom message as "Custom Hello World from Cucumber!"