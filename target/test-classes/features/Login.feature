Feature: Login

Scenario: Verify Login using Correct Username and Correct Password
  Given I am on the login page
  When I enter valid credentials
  Then I should see the dashboard

#  Scenario: Verify Login using In-Correct Username and Correct Password
#    Given I am on the login page
#    When I enter In-Correct Username and Correct Password
#    Then I should see the dashboard

#  Scenario: Verify Login using Correct Username and In-Correct Password
#    Given I am on the login page
#    When I enter Correct Username and In-Correct Password
#    Then I should see the dashboard

#  Scenario: Verify Login using In-Correct Username and In-Correct Password
#    Given I am on the login page
#    When I enter In-Correct Username and In-Correct Password
#    Then I should see the dashboard