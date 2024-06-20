@Google 
Feature: Test Google search functionality

Background: Navigate To Google Page
Given I am on the Google search page

@Feat4
Scenario: As a user I enter a search criteria in Google
#Given I am on the Google search page
When I enter a search criteria
#And click on the search button
Then the results match the criteria
And I select the first result option


@Feat5
Scenario Outline: As a user I enter different search criteria in Google
When I enter a different search <criteria>
And I click on the search button for the search
Examples:
    | criteria |
    | Jirafa   |
    | Elefante |
    | Conejo   |



