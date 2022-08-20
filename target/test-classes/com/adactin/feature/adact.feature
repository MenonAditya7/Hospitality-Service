Feature: Booking through Adactin hotel application 

Scenario: Launching the Adactin Hotel Application

Given The system is ready to work
When User launches the application
And User maximizes the screen
Then The application is launched
When User enters the Login ID and password
Then Clicks the login button
Then User in Home page
 
 
 Scenario: Searching the hotels
 Given To search hotels
 When User selects hotel location
 When User selects the hotel 
 Then User selects the room type
 And User selects number of rooms
Then User enters check in date
And User enter check out date
Then User selects adults per room
And User selects children per room
Then User click on search button

Scenario: To select the given Hotel

When User clicks on the selected radio button
Then User will click on the continue button



Scenario: Booking the given Hotel

Given User enters the person details for booking
When User enter the First name 
And User enter the Last name
Then User enter the Biling address
Then User enter the Card number
And User enter the Card type
Then User enter the Card expiry date
And User enter the Card CVV number
Then User click on book now buttton




Scenario: Complete the Booking
Given User verify the booking details
Then User clicks the logout button

