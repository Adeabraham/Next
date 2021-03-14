Feature:Search for anything
  As a customer
  I want to be able to search for any item of my choice
  so I can choose one to buy.

 Scenario Outline: Search for anything to buy
   Given I navigate to Next homepage
   When I enter "<Items>" into the search field
   And I click on search button
   Then the search for "Trousers" is displayed

 Examples:
|Items     |
|Trousers  |
#|Furniture |
#|Shoes     |
#|Cap       |

