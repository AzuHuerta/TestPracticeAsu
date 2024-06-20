@Feat9
Feature: Login in the SwagLabs Page with a User and Password

    Scenario Outline: As an user I Loggin in a SwagLabs Page with user a Password
    Given I am on the SwagLabs Page
    When I put the <user> and <pass> 
    Then I click on the Login Button

    Examples:
        | user | pass |
        | standard_user | secret_sauce  |


    Scenario: Added All items to Cart and pay it
    Given I select each item and Add to Cart
    When I select the Cart option
    Then click in the checkout botton for the continue purchase
    Then I fill the fields solicited
    And click in the Continue botton
    Then I finish with the purchase
    #And I validate that order was realized
    Then I select the Back Home button
    And I put the mouse over on one item