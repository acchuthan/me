Feature: To validate login functionality

Scenario Outline: to verify login function with invalid username and invalid password

Given user is in the Deals direct home page
When  user mouse over to Person icon
When  user clicked my details in the drop down list preset in the person icon
Then  user is in the signup and signin Taskpage
When  user clicked the signin tab
And   user entered invalid "<email>" and invalid "<password>"
And   user entered sigin button
Then  The system should console the text invalid username or password
Examples:
|email            | password |
|ruban@gmail.com  | ruban    |

@smoke
Scenario Outline: To verify Login functionality with valid username and valid password
Given user is in the Deals direct home page
When  user mouse over to Person icon
When  user clicked my details in the drop down list preset in the person icon
Then  user is in the signup and signin Taskpage
When  user clicked the signin tab
And   user entered valid "<email>" and valid "<password>"
And   user entered sigin button
Then  The user navigated to the next page
Examples:
|email                 | password |
|acchuthantm@gmail.com | Acchu123 |

@sanity
Scenario: To Verify the wishlist functionality by selecting the product and adding to0 the wishlist
Given user is in the Deals direct home page
When  user mouseover to the mens category available in the homepage
And   user selected the footware option available in the MEN catergory
Then  user have to navigated to the footwear page
When  user selected the Brand ,Size and pricefilter
And   user set the price limits from the horizontal scrollbar

