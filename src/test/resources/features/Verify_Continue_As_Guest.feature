
Feature: Verify continue as guest
  Scenario: verify the continue as a guest feature
    Given user is navigated successfully to Checkout page
    When user clicks on continue as guest button
    Then user is able to see the label
      | continue as guest