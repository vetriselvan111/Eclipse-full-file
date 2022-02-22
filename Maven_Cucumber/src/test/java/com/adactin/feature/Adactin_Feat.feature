Feature: Hotel Booking in Adactin Application

@Ad1
Scenario Outline: Login
Given user Launch The Application
When user Enter the "<Username>" In Username Field
And user Enter the "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:

  |Username|Password|
  |A|A@123|
  |E|E@123|
  |Vetriselvan|IO1538|

@Ad2
Scenario: Search Hotel

When user Select The "Sydney"
And user Select "Hotel Hervey"
And user Select Room "Double"
And user Select the Number of Rooms
And user Enter Check In Date
And user Enter Check Out Date
And user Select The Adults per Room
And user Select The Children per Room
Then user Click On The Search Button And It Navigates To The Select Hotel Page

@Ad3
Scenario: Select Hotel

When user Select The CheckBox Button
Then user Click On The Continue Button And It Navigates To The Book Hotel Page

@Ad4
Scenario: Book Hotel

When user Enter The First Name
And user Enter The Last Name
And user Enter The Address
And user Enter The Credit Card No
And user Select The Credit Card Type
And user Select The Expiry Date
And user Enter The CVV Number
Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page 

@Ad5
Scenario: Booking Confirmation

Then user click My Itinerary Button And It Navigates To The Booking Cancellation Page

@Ad6
Scenario: Booking Cancellation

When user Select CheckBox Button
And user Click On The Cancel Selected Button 
And user Accept The Alert Message
Then user click Logout Button And It Navigates To The Home Page














