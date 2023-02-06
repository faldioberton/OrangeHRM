@FirstTest
Feature: Login functionality

  @Positive
  Scenario Outline: Ensure user successfully edit profile
    #precondition
    Given user is on Orangehrm Sign in page
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    #expected
    Then user verify <status> login as User result
    #step
    When user click My Info
    And user click Nationality
    Then user choose Indonesian
    And user click Marital Status
    Then user choose single
    And user choose male for gender
    Then user click Save
    When user click Time
    Then user click Attendance
    And user click menu punch
    And user click button In
    Then user click button Out



    Examples:
      | username | password    | status  |
      | Damiani   | @Admin123   | success |