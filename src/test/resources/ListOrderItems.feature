#Features AcademyBugs FindBugs list of order products
@Feat3
Feature: Navigate to List of the search items inside FindBugs across the AcademyBugs


Scenario: I am on the FindBugs web without logging in
    Given I Navigate to www.academybugs.com/find-bugs/
    When I click in the search list of items
    Then The first result is the more cheaper item
    #Then Select the second option and the search will be done
    #And The first result is the more cheaper item
