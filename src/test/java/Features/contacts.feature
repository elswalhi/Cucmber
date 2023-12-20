Feature: contact page
  Scenario: Make sure that email text field is visible
    Given user should open the website
    When user enter username as "swalhi" and password as "zero1280" and click on btn
    And  clicks on contact
    Then Email text filed should be visible
    @Regression
  Scenario: Add new contact
    Given user should open the website
    When user enter username as "swalhi" and password as "zero1280" and click on btn
    And  clicks on contact
    And Clicks on Add new contact
    And Fill the firstname and lastname
    Then A new contact should be added
