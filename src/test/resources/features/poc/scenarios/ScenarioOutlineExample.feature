@release:Release-1
@release:Sprint-2
Feature: Scenario outline example

  Use of scenario outline 

	@ignore 
  Scenario Outline: Get custom messages 
    Given I set the custom message as "<customMessage>"
    When I set the custom message flag to "on"
    Then I should get the message "<expectedCustomMessage>"
    
    Examples:
      | customMessage | expectedCustomMessage |
      | Some Message  | Some Message          |
      |               | Expected Message      |