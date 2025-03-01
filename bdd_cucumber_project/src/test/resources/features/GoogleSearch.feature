Feature: Testing Google search functionality

#Scenario: Searching Selenium Interview Questions
#Given User is on google search page
#When User types "Selenium Interview Question" in the search input field
#And user pressed enter button
#Then User should to navigate search page with title "Selenium Interview Question"
#And Close the browser

Scenario Outline: Searching <text> in google
Given User is on google search page
When User types <text> in the search input field in google
And user pressed enter button
Then User should to navigate search page with title <text> on google
And Close the browser
Examples:
|text|
|Selenium Interview Question|
|Manual Interview Question|
|Api Interview Question|