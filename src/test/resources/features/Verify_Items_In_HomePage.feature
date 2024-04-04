
Feature: Check Items in Home Page
  Scenario: User should be able to see Items in Home Page
    Given User is navigated successfully to Visionworks Home Page
    Then User is able to see a list of links
      | GLASSES        |
      | SUNGLASSES     |
      | CONTACT LENSES |
      | BRANDS         |
      | LENSES         |
      | OFFERS         |
