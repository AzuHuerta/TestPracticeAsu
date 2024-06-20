@Feat6 
Feature: New register in DemoQa Page



@NewRegister
Scenario: As a user I put new register in DemoQA page
    Given I am on the DemoQA page 
    When select the Add button
    Then I put all required information <Name>, <Lastname>, <mail>, <age>, <salary>, <dept>
    And I click the submit button
    And The new register is showed in the Web Table 

    Examples:
        | Name      | Lastname | mail                     | age | salary | dept |
        |Asuncion| Huerta   | asuhuerta1222@gmail.com  | 28  | 30000  | IT   |


@EditRegister
Scenario: As a user I edit the new register created on a DemoQA page
    Given I select the edit button of the new register
    When I edit the fields that I choose
    Then I save the changes by clicking on the submit button
    And Validate that fields was updated


@DeleteRegister
Scenario: As a user I delete a register on a DemoQA page
    Given I select the delete button of any record
    When Validate that don't exists the record eliminated

#Feature: As user I can't save a empty field onside record

@EmptyRegister
Scenario: As user I can't leave empty mail field
    Given I select the edit button of the one record
    When I delete the data of mail field
    Then I try save the changes by clicking on a submit button
    And validate that changes aren't saved because the mail field is empty





