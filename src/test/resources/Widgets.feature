@Widgets
Feature: As an user I navigate to Widgets section on a DemoQA

    Once inside on a widgets section I interactue with a differents elements


    Background: Navigate To DemoQA Page
    Given I am on the DemoQA widgets page

    @W1
    Scenario: As user I interactue with a Accodian element on Page
    When I select the accordian option
    Then I can see the text corresponding to the selected option
    And I select newly the accordian option and the text is hide


    Scenario Outline: I put the colors on the input AutoComplete
    When I select the AutoComplete option
    Then I put the <Colors> on the input
    Then I select the same option that's show

    Examples:
        | Colors |
        | Gre  |
        | Yell  |

    Scenario: I select a date of the date picker
    When I select the DatePicker option
    Then I select an date of DatePicker

    Scenario: I interactue with a slider bar
    When I select the Slider option
    Then I drag the slider option until 100


    Scenario: I start load to the progress bar and pause the processs
    When I select the progress bar option
    Then I select the start button
    Then I stop the load of the bar on 50% of percent


    Scenario Outline: I navigate on a different tabs options
    When I select the Tabs option
    Then I select the diferents <Tabs> to navigate

    Examples:
        | Tabs |
        | What  |
        | Origin  |
        | Use  |

    







