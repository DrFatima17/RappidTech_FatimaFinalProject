
Feature: Check items in Contact Lenses dropbox

  Scenario: User is able to see items in contact lenses drop box
    Given  User is navigated successfully to Visionworks Home Page
    When User clicks on Contact Lenses Link
    Then User is able to see a list of items in contact lenses dropbox
      | ACUVUE         |
      | AIR OPTIX      |
      | AQUATECH       |
      | DAILIES        |
      | PROCLEAR       |
      | PUREVISION     |
      | Rebates        |
      | Contact Lenses |
