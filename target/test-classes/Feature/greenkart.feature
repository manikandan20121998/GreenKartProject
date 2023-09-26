@E2E
Feature: To place a order of onion vegetables

Background:
Given user should go to greenkart webpage 

@smoke
Scenario:
To search onion vegtable and place to order

When user pass the onion on search text box
When user press the increment btn for kg 
And user click the add to cart bitton
And then click add to cart icon
When user has to click checkout btn
And user pass coupon code "1234" and apply
And user has to click place btn
When user click a country for select purpose
And user confirm the btn
Then user click the proceed btn

@sanity
Scenario:
To user set the vegetables and price map wise

When user get common veg and price
And user get particular veg

@Regression
Scenario:
To validate the duplicate product are there or not

When Add all products in list and print in console
And add all added products in set interface check any duplicate there or not











