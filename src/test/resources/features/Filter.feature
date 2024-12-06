Feature: Sorting

  Scenario: Verify Sorting By Name(Z-A)
    Given I am on the login page
    When I enter valid credentials
    Then I should see the dashboard
    Then I should go to Sorting the product By Name Z-A

#  Scenario: Verify Sorting By Name(A-Z)
#    Given I am on the login page
#    When I enter valid credentials
#    Then I should see the dashboard
#    Then I should go to sorting the product By Name A-Z
#
#  Scenario: Verify Sorting By Name(low to high)
#    Given I am on the login page
#    When I enter valid credentials
#    Then I should see the dashboard
#    Then I should go to Sorting the product By Name low to high
#
#  Scenario: Verify Sorting By Name(high to low)
#    Given I am on the login page
#    When I enter valid credentials
#    Then I should see the dashboard
#    Then I should go to Sorting the product By Name high to low

