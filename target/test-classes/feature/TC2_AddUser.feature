@SecondTest
Feature: Add User functionality

  @Positive
  Scenario Outline: Ensure user successfully add user
    #precondition
    Given user is on Orangehrm Sign in page
    #steps
    When user Input <username> as username
    And user Input <password> as password
    And user click enter
    #expected
    Then user Verify <status> login result
    #steps
    When user click menu PIM to add user
    And user click button add
    Then user input First Name
    And user input Last Name
    Then user click button switch create login details
    And user input <user> as user
    And user input <pass> as pass
    And user input <pass> as pass2
    And user click save
    #expected
    Then user success add user

    Examples:
      | username | password    | status  | user    | pass      |
      | Admin    | admin123    | success | Damiani  | @Admin123 |

