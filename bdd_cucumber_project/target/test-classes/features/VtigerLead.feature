Feature: Create lead in Vtiger application

  Background: 
    Given user already in login page
    And user login successfully with valid data
    And click on navigation bar
    And go to Marketing and select Leads

  Scenario Outline: Create new lead with name as <firstName>
    When click on Add Leads button and enter firstname as <firstName> ,last as <lastName> ,number as <number> and click on save button
    And click on All link
    Then varify lead is created with <lastName>
    And close the browser

    Examples: 
      | firstName | lastName | number |
      | QA        | Champak  |    123 |

  Scenario Outline: Update lead and validate it
   Given update new lead click on header lead
  And click on newly created lead checkbox
  And click on edit pencil for lead
  And click on company name checkbox
  And enter company name as <companyName>
  And click on save button on update page for lead
  Then validate with it <companyName>
  And close the browser
  
 Examples:
  | firstName | companyName |
  | QA       | Infosys     |
  
  
  Scenario Outline: Delete all leads and validate it
    When click on newly created lead checkbox
    And click on delete logo
    And user will get a popup to comfirm deletion, select Yes
    Then varify that newly created lead <firstName> is deleted
    And close the browser

    Examples: 
      | firstName |
      | QA        |
