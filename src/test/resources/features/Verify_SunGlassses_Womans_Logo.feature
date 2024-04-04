@smoke
Feature: Check if Women's Sunglasses Logo is Displayed
  Background: User is navigated successfully to Visionworks Home Page
  Scenario: Women's Sunglasses logo should be displayed on Sunglasses Page for Women
   Given user clicks on Sunglasses Dropbox
    And user clicks on Women's link
    Then user is able to see Logo "WOMEN'S SUNGLASSES"