@ErrorHandling
Feature: Pairing Attribute Error Handling 
  The error handling feature provides to the application the capability to handle database errors in order to replace them for a user friendly error message.
    
  Background:
    Given A Session has been oppened
    And A Planning has been created
  
  @ignore @RegressionCRS 
  Scenario: Pairing Attribute Unique Key Constraint
    Given A user has created a Pairing Attribute with name "PATTR_TEST"
    When A new user attempts to create a new Pairing Attribute with the same name
    Then The application must return the user friendly error message "The name is already used by an existing attribute."
  
  @ignore @RegressionCRS @primaryKey
  Scenario: Pairing Attribute Primary Key Constraint
    Given A user has created a Pairing Attribute with id "4000"
    When A new user attempts to create a new Pairing Attribute with the same id
    Then The application must return the user friendly error message "The primary key of the attribute already exists."