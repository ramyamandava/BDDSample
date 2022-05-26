@PhaseOne
Feature: Contact Funtions
 User can create a contact,Edit/view/delete a contact
@RegressionTest @SmokeTest
  Scenario: Create a contact
    Given User must have logged in
    When User create a new contact
    
 Scenario: View contact
    Given User must have logged in
    When User view a contact details
 @RegressionTest   
    Scenario: Edit a contact
    Given User must have logged in
    When User edit a contact
@SmokeTest    
    Scenario: Delete a contact
    Given User must have logged in
    When User delete a contact