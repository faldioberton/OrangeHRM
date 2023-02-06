@FirstTest
Feature: Login functionality

  @Positive
  Scenario Outline: Ensure user successfully login
    #precondition
    Given user is on Orangehrm Sign in page
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    #expected
    Then user verify <status> login as Admin result

    Examples:
      | username | password    | status  |
      | Admin    | admin123    | success |
  @Negative
  Scenario Outline: Ensure user failed login with wrong password
    #precondition
    Given user is on Orangehrm Sign in page
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    #expected
    Then user failed login

    Examples:
      | username | password  |
      | Admin    | admin1234 |

