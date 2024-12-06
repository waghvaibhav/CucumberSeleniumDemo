Feature: Checkout

  Scenario: Verify product Add to cart successful
    Given I am on the login page
    When I enter valid credentials
    Then I should see the dashboard
    Then select the Product
    Then Add To Cart
    Then go to Shopping Cart
    Then click Checkout button
    Then Enter Checkout Details