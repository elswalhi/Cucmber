Feature: login
  Scenario: user can login with valid username and password
    Given user should open the website
    When user enter user name and password and click on btn
    Then user should navigate to home page