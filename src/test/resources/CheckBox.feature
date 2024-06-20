
@Feat7
Feature: Select a CheckBox in DemoQA Page

    @SelectCheckBox
    Scenario: As a user I select a Checkbox option on DemoQA page
        Given I select the option the CheckBox
        When Validate that option is selected

    @UnselectedCheckBox
    Scenario: As user I validate that checkbox option isn't selected on DemoQA Page
        Given I navigate to DemoQA Page
        When I validate that any Checkbox option isn't selected