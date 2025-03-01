Feature: Create Contact in Vtiger application
Background:
   Given user is on login page
   And enter username enter password click on login button
   Then validate login sucessful
   And click on navigation bar for contact
   And click on marketing
   And click on contacts
   
Scenario Outline: Create new contact and validate it
  Given create new contact
  And click on salotation
  And enter firstname as <firstName>
  And enter lastname as <lastName>
  And enter office phone as <officePhone>
  And click on save on new created contact page
  And click on header contacts
  And search new created contact with first name as <firstName>
  Then valiadate new created with <firstName>
  And quit the browser
  Examples:
  |firstName|lastName|officePhone|
  |QA       |Tester  |123456789  |
  
Scenario Outline: update contact and validate it
  Given update new contact click on header contact
  And search new created contact with first name as <firstname>
  And click on new created contact checkbox
  And click on edit pencil
  And click on job title checkbox
  And enter job title as <title>
  And click on save button on update page 
  Then validate with title as <title>
  And quit the browser
  Examples:
  |firstname|title        |
  |QA       |Test Engineer|
Scenario Outline: Delete new contact and validate it
  Given search new created contact with first name as <firstname>
  And click on new created contact checkbox
  And click on delete button
  Then click on yes button of confirmation pop up 
  And delete verify with <text>
  Examples:
  |firstname|text|
  |QA       |No Contacts found|
  