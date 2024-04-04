Feature: Login Page

  Background:
    Given User is navigated successfully to Visionworks Home Page
   When user clicks on MyAccount Link
    And user clicks on SignIn Link

  Scenario: Sign In Logo is displayed
    Then user is able to see the sign in label

  Scenario: Sign in Fields are displayed
 Then user is able to see the sign in fields
