Feature: Validating order placement in tricentis application

Scenario:
    Given user is on tricentis main page
    And click on login link
   And enter email and password
   And click on login button
   Then verify login successful with email profile
   
Scenario Outline: Check product in cart
Given user is on product page select the product
And click on add to cart
And click on shipping cart
Then verify with product name as <productName>
And click on check boxes 
And click on checkout and continue
Examples:
|productName     |
|14.1-inch Laptop|

Scenario: Check Payment Options
Given check payment option
And select cod option
Then click on continues

Scenario Outline: Place order
Given click on confirm
Then verify successMsg with <successMsg> and place order
And close the browser
Examples:
|successMsg|
|Your order has been successfully processed!|

