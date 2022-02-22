Feature: To order Dresses in My store Application

@AP1
Scenario: Login
Given user Launch The Application
When user Enter The Email id In Email id Field
And user Enter The Password In Password Field
Then user Click On The Sign in Button And It Navigates To The Home Page

@AP2
Scenario: Women

When user Click The Women Button And It Navigates To Women Page
And user Click The Dresses Button And It Navigates To Casualdresses Page
And user Click The Casualdresses Button And It Navigates To Image Page
And user Click The Image And It Navigates To Quantity Page
And user Click The Quantity And Size 
And user Click The Add To Cart Button And It Navigates To Shopping Cart Page
And user Click The Proceed To Checkout Button And It Navigates To Order Page
And user Click The Proceed To Checkout Button And It Navigates To Address Page
And user Click The Proceed To Checkout Button And It Navigates To Shipping Page
And user Click The Checkbox And Proceed To Checkout Button And It Navigates To Payment Page
And user Click The Pay Bybank Button And It Navigates To Confirmation Page
And user Click Confirm Order Button And It Navigates Order Confirmation Page
Then user Click The Sign Out Button And It Navigates To Login Page
