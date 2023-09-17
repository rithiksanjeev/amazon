# amazon
Build management - Maven
A simple framework using POM that automates amazon.com
Reporting - Allure

Task 1: Write a test document to list the use cases you would test via automation to verify search, filter and add-to-cart functionalities on amazon.in.  

Introduction

            This test plan outlines the use cases to be tested via automation to verify the Search, Filter, and Add-to-Cart functionalities on Amazon.in. The goal of this testing is to ensure a seamless and error-free user experience for customers while searching for products, applying filters, and adding items to their shopping cart on the Amazon.in website.

Scope

The scope of this test plan covers the following functionalities on Amazon.in:

Search: The ability to search for products using keywords.
Filter: Applying various filters to refine search results.
Add-to-Cart: Adding products to the shopping cart.

Automation Tools:

For the automation of these test cases, we will utilize Selenium WebDriver, a widely-used web automation framework.
          

Test Cases
Search Functionality
Verify Basic Search:
Input: Valid search query (e.g., "smartphone").
Expected Outcome: Search results page is displayed with relevant products.


Verify Empty Search:
Input: Empty search query.
Expected Outcome: Error message indicating the need for a search query.


Verify Search with Special Characters:
           Input: Search query with special characters (e.g., "@#$%^&").
Expected Outcome: Proper handling of special characters, displaying a relevant message.


Verify Search Suggestions:
           Input: Partial search query (e.g., "lap").
Expected Outcome: Display of search suggestions dropdown.


Verify Auto-Suggest Selection:
Input: Select a suggestion from the dropdown.
Expected Outcome: Display of results related to the selected suggestion.



Filter Functionality


Verify Price Filter:
Input: Apply a price range filter.
Expected Outcome: Display of products within the specified price range.
Verify Brand Filter:
Input: Apply a filter for a specific brand.
Expected Outcome: Display of products from the selected brand.
Verify Rating Filter:
           Input: Apply a filter based on product ratings.
Expected Outcome: Display of products with the selected rating or higher.



Verify Category Filter:
Input: Apply a filter for a specific product category.
Expected Outcome: Display of products within the selected category.

Add-to-Cart Functionality


Verify Adding a Product to Cart:
Input: Add a product to the cart.
Expected Outcome: The product is added to the cart, and the cart count is updated.

Verify Updating Cart Quantity:
Input: Change the quantity of items in the cart.
Expected Outcome: The cart reflects the updated quantity, and the total price is adjusted accordingly.

Verify Removing Item from Cart:
Input: Remove an item from the cart.
Expected Outcome: The item is removed from the cart, and the cart reflects the updated total.

Verify Empty Cart:
           Input: Remove all items from the cart.
Expected Outcome: The cart is empty, and a message reflects this.


Test Data
For data-driven testing, we will use a variety of test data, including valid and invalid search queries, different filter criteria, and various products for the Add-to-Cart functionality.

Test Environment
The tests will be conducted on the latest versions of popular web browsers (e.g., Chrome, Firefox) on Windows and macOS platforms.

Test Execution
Test automation scripts will be written using Selenium WebDriver and a testing framework (e.g., TestNG, JUnit). Test data will be managed using data-driven testing techniques. Test results will be logged and reported.

Conclusion
By executing the test cases outlined in this plan, we aim to ensure that the Search, Filter, and Add-to-Cart functionalities of Amazon.in are robust, user-friendly, and free from defects. Automation testing will enhance efficiency and accuracy in validating these critical e-commerce features.


Task 2: Automate the use case listed below using a testing framework of your choice. It’d be great if you make your framework modular, scalable and take care of reports and multi-browser scenarios. 

Note: Make assumptions of expected behaviour where needed and mention in test document where possible. 

1. Launch Chrome browser and open an E-com website such as 
https://www.amazon.in/ OR https://www.meesho.com/ 
2. Wait for the page to load and verify the page title. 
3. In the search box, enter the search key as "smartwatches" and click on the search icon 
4. Select brand as "noise" 
5. Add a price filter with 1000 as the min price and 5000 as the max price 
6. In the search results, check that the watches displayed on the page are within the price range 
7. Sort price from high to low using the sort option available in the upper right corner 8. Open the product with the highest price(this will open the product in a new window) 9. Check the product details from the new window and add the product to the cart 

10. Verify that the product has been added to the cart
11. Close the new window and return to the main window 
12. Follow steps 4 to 11 for 3 more brands(pick the brands as per your choice and feel free to use an excel sheet or a data provider to handle multiple brands).

