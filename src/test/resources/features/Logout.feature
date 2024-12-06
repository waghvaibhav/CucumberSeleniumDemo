Feature: logout

  Scenario: Successful logout
    Given I am on the login page
    When I enter valid credentials
    Then I should see the dashboard
    Then I should see navigate
    Then I should logout