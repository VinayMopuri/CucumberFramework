@all
Feature: Login Functionality
Background:
Given open the login funcitionality of application
When user enters the username and password
And Click on the sign in button


@Smoketest
Scenario: 2 Test The Admin users
Then click on dashboard
Then Click on Admin
Then Click on User management 
And Click on Users
And Click on Nationalities
Then  logout the Application

#@Smoketest @Regrationtest
#Scenario: 3 Test The Admin users
#Then Click on Admin
#Then Click on Nationalities
#Then  logout the Application

