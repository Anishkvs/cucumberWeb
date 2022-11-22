Feature: Application login

  Scenario: Home page default login
    Given User is on Netbanking login page
    When User enter into application with username and password
    Then Home page is populated
    And Card is displayed
