Feature: feature to test is login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples:
      | username  | password |
      | anas12345 | 1234     |