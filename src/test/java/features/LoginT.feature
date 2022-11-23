Feature: Application login

  Scenario: Home page default login
    Given User is on Netbanking login page
    When User enter into application with "Jin" and "12345"
    Then Home page is populated
    And Card displayed is "true"

    Scenario: Home page default login
    Given User is on Netbanking login page
    When User enter into application with "John" and "236854"
    Then Home page is populated
    And Card displayed is "false"