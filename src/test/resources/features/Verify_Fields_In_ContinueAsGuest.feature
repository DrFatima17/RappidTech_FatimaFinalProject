@smoke
  Feature: Verify input fields in continue as guest page
Scenario: verify the input fields in continue as a guest page
Given user is navigated successfully to Checkout page
When user clicks on continue as guest button
Then user is able to enter following values in their proper input boxes
  | FirstName            |
  | LastName             |
  | email12345@gmail.com |