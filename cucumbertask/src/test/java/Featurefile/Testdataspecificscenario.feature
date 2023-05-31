
Feature: login functionality
Scenario: login  with valid credentials

Given user navigate to login page
When user enters the following details                  
            |vinaymopuri13@gmail.com|   |Vinay12|
            |vinaymopuri134@gmail.com| |123456|
And clicks on login button
Then user should get login scucess                        