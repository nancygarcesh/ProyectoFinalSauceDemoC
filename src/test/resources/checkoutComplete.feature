Feature: Checkout Complete page
  Background: User is in the checkout page
    Given I am in sauce demo web page
    When I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button
    Then The home page should be displayed
    When I add the product1 "Sauce Labs Bolt T-Shirt" to the cart
    And I add the product1 "Sauce Labs Fleece Jacket" to the cart
    And I click on the cart button
    Then I click on the checkout button

  @run
  Scenario: Complete the shopping
    When I fill in the checkout fields with first name "Billie" last name "Eilish" and postal code "0000"
    And I click on the continue button
    And I click on the finish button
