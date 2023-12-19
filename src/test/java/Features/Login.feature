Feature: login
#  Scenario: user can login with valid username and password
#    Given user should open the website
#    When user enter username as swalhi and password as zero1280 and click on btn
#    |swalhi|zero1280|
#    Then user should navigate to home page

  Scenario Outline: user cant Login with invalid data
    Given user should open the website
    When user enter username as "<username>" and password as "<password>" and click on btn
    Then Error message should be appear

    Examples:
      | username | password |
      | swalhi   | wrong    |
      | wrong    | swalhi   |
      | wrong    | wrong    |