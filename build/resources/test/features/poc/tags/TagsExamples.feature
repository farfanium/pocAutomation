@release:Release-2
@release:Sprint-3
Feature: Tags organization examples

  @ignore @Regression
  Scenario: Single tag example
    Given I set the custom message as "Welcome aboard!!!"
      And I set the custom message flag to "on"
    When I merge the default message and the custom message
    Then I must get both messages concatenated
    
  @ignore @Regression @Smoke
  Scenario: Double tag example
    Given I set the custom message as "Welcome aboard!!!"
      And I set the custom message flag to "on"
    When I merge the default message and the custom message
    Then I must get both messages concatenated
  
  @ignore @manual
  Scenario: Version tag example
    Given I set the custom message as "Welcome aboard!!!"
      And I set the custom message flag to "on"
    When I merge the default message and the custom message
    Then I must get both messages concatenated
    
  @ignore @manual
  Scenario: Manual test 
    Given I mark this as a manual execution test
    Then I won't automate this test