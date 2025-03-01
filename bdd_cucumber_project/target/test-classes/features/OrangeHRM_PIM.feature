Feature: Testing PIM functionality
Background:
Given user in login page
And enter username
And enter password
And click on login
Then verify login successful using link

Scenario Outline: Validate PIM creation
Given create pim employee
And click on add button
And add first name as <firstName>
And add last name as <lastName>
And add emp Id as <empId>
And click on save for new employee page
And click on pim
Then search <empId> and verify pim creation
Examples:
|firstName|lastName|empId|
|QA       |Engineer|A4554 |

Scenario Outline: Validate PIM update
Given update pim employee details
And click on pim
And search emp id as <empId> click on search scroll down
And click on checkBox for update
And click on edit button
And click on job link
And click on job title dropdown
And select job title as <jobTitle>
And click on save from job page
And click on pim
And search emp id as <empId> click on search scroll down
Then verify job title as <jobTitle>
Examples:
| empId |jobTitle        |
| A4554 |Automaton Tester|

Scenario Outline: Validate PIM deletion
Given delete process start
And click on pim
And search emp id as <empId> click on search scroll down
And click on checkBox for delete
And click on delete option
And click on confirmation pop up yes,Delete
And search emp id as <empId> click on search scroll down
Then verify employee delete successful with <msg>
Examples:
|empId|msg|
|A4554 |No Records Found|