Feature: As an ecommerce user, I want to select two products and have both added to the shopping cart.

  Background:
    Given The user is on the page

  @PageLoads
  Scenario: Verify that page loads correctly
    Then  He looks at the logo My Store

  @AddBothProducts
  Scenario: validate that the user can add a product to the shopping cart
    When the user adds both products to the shopping cart
    Then he visualizes the first product Printed Chiffon Dress
    And he visualize the second product Printed Dress

  @FilterByProductName
  Scenario: validate that the user can add a product filtered by name
    When the user searches for the product name and adds it to the shopping cart
    |productName|quantity|
    |Printed Dress|2     |
    Then the user views the product in the shopping cart section Product successfully added to your shopping cart
