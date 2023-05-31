Feature: Login Functionality

Background: 
Given User navigates to Login Page

Scenario Outline: Login functionality with Valid Credentials
When Enter Valid Username <Username>
And Enter Valid Password <Password>
And clcik on Login button
Then User should login Scuccessfully 

Examples:
|Username								 |Password |
|vinaymopuri13@gmail.com |Vinay@13   |
|vinaymopuri134@gmail.com |Vinay@134|