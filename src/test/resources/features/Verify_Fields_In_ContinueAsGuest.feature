@smoke
Feature: Verify order summary in checkout page

  Scenario: verify order summary in checkout page
    Given user is navigated successfully to Checkout page
    When user clicks on continue as guest button
    And user is able to enter following values in their proper input boxes
      | FirstName            |
      | LastName             |
      | email12345@gmail.com |
    And user clicks on continue as guest button in guest page
    Then user is able to see the order summary