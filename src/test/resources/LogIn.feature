Feature: Login Succesfully

Scenario Outline: Customer is able to login
Given user is on home page
When user enters "<username>" And "<password>"
Then validate the "<user>"


Examples:
|username|password|user|
|ankurrkashyapp8011@gmail.com|mobcamA|Hello, ankur|



Scenario: Search and pick a product by brand
Given search box is editable
When user enters "<product>" and enters Enter
|T-Shirt|
And Selects product and applies filter for brand "<name>"
And gets the product attribute as size and color
Then successfully done