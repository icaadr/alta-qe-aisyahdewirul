@Sales
Feature: Sales flow
  description Class

  Scenario: User make a purchase with 2 item
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    And User choice 2 products from the list
    Then User return to page chart
    Then User already on checkout page
    When User input "Aisyah" as userFirst and input "DewiRulyadi" as last and input "123" as zip
    Then User ensure the item total and tax
    And User ensure the total price after sum with the tax
    Then User Has Completed the Checkout Order

