
Feature: Verify Checkout
  Scenario: user is able to checkout
    Given user is navigated successfully to Raybans Display Page
    And user clicks on add to cart button
    And user clicks on non-prescription button
    And user clicks on checkout button
    When user clicks on checkout button in cart page
    Then user is able to see new customer label