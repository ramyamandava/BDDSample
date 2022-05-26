
Feature: Login Function
  
 # Scenario: Valid Login
 #   Given User is on Login page
  #  When User enters Login credentials
   # Then User should be navigated to home page
    

   #Scenario: Valid Login
   # Given User is on Login page
   # When User enters "tomsmith" and "SuperSecretPassword!"
   # Then User should be navigated to home page

    
   #Scenario Outline: Valid Login
#    Given User is on Login page
#    When User enters "<username>" and "<password>"
#   Then User should be navigated to home page
    
#   Examples:
#   | username |password|
#   |testuser1 |welcome1|
#   |testuser2 |welcome2|
#   |tomsmith |SuperSecretPassword!|
    
    
    
  Scenario: Valid Login
    Given User is on Login page
    When User enters Login credentials
    | username |password|
    |tomsmith |SuperSecretPassword!|
    Then User should be navigated to home page
    