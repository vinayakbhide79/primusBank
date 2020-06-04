Feature: Search Feature

Background: User is sucessfully logged in

When user opens the "chrome" browser and exe "C:\\Users\\vinay\\OneDrive\\Desktop\\Project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"
When user enters "Admin" as user name
When user enters "Admin" as password
When user click on Login button

@SmokeTest
Scenario: Search Functionality with valid date
When user click on branches
When user select "INDIA" as country
When user select "MAHARASTRA" as state
When user select "MUMBAI" as city
When user click on Search button
Then Application shows search result for "MUMBAI" city

