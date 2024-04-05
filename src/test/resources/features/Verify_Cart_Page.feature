
Feature: Verify Item in Cart Page
  Scenario: Verify the item details in Cart Page
    Given user is navigated successfully to Raybans Display Page
    When user clicks on add to cart button
    And user clicks on non-prescription button
    And user clicks on checkout button
    Then user should be able to see the item details in cart