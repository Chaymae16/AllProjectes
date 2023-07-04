Feature: Login related scenarios
 #this is user story and
  #one user story we have multiple test cases
  #and one test case considered as one scenario
  Scenario: Valid admin login
    Given user is navigate to HRMS application
    When user enters valid admin username and password
    And user clicks on login button
    Then user s successfully logged in the application

