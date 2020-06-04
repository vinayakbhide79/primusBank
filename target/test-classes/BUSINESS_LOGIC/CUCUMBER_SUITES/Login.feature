Feature: Login Feature

Background: User is sucessfully logged in
When user opens the "chrome" browser and exe "C:\\Users\\vinay\\OneDrive\\Desktop\\Project\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"

Scenario: Login Functionality for Valid Username and Password
When user enters "admin" as user name
When user enters "Admin" as password
When user click on Login button
Then user is on "Admin" main page and get msg as welcome to Admin


Scenario: Login Functionality for Valid Username and Password
When user enters "Admin" as user name
When user enters "Admin123" as password
When user click on Login button
Then user is on "Admin" main page and get msg as welcome to Admin