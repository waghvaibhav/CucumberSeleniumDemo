Feature: AddToCart

  Scenario: Verify product Add to cart successful
    Given I am on the login page
    When I enter valid credentials
    Then I should see the dashboard
    Then select the Product
    Then Add To Cart