#Features AcademyBugs FindBugs Shop
@Feat
Feature: Navigate to AcademyBugs


Background: I am on the AcademyBugs web without logging in
    Given I Navigate to www.academybugs.com

#@Test1
Scenario: I can access the subpage of Find Bugs through the navigation bar
    #Given I navigate to the AcademyBugs Page
    When I go to Find Bugs using the navigation bar
    #Examples:
        #| section    |
        #| Find Bugs  |
#@Test1
Scenario: I can add an Item to the cartshop
    When I select the item
    Then I add to cart the selected item



Scenario: I go to checkout Cart
    Given I added the item and I click the View Cart button
    When I can click it the checkout button in the shopping cart