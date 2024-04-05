@smoke
Feature:Verify Item details

  Scenario: Verify item details are displayed on clicking the item
    Given user is navigated successfully to Sunglasses Women's Page
    When user clicks on Ray-Ban RB 7159
    Then user is able to see the product details
      | Labels           | isDisplayed |
      | RB 7159          | true        |
      | HAVANA           | true        |
      | sku_000001343585 | true        |
      | Colors           | true        |
      | Frame:           | true        |
      | $249.95          | true        |