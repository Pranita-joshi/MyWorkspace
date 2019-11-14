#Author: Pranita Joshi
@login
Feature: Login Functionality
  I want to verify login page functionality for Quore web application

  Background: 
    Given I navigate to Quore Web application url
    When I verify login page title
      | Title          |
      | Login \| Quore |

  @first
  Scenario: Verify application logo & version
    Then I verify application Logo is present
    And I verify application version is present

  @second
  Scenario: Verify user authentication with valid username & password
    Then I enter valid username and password
    And I click on login button
    And I verify home page of application

  @third
  Scenario Outline: Verify user authentication with invalid username and/or password
    Then I enter "<username>" username and "<password>" password
    And I click login button
    And I verify "<error>" error message

    Examples: 
      | username | password | error                                         |
      | pranita  | testing  | Oops! Your Quore ID or password is incorrect. |
      | p        | t        | Oops! Your Quore ID or password is incorrect. |

  @fourth
  Scenario: Verify links on Login page
    Then I verify links are present and valid on page
      | Forgot password?                        |
      | Forgot Quore ID?                        |
      | Learn what Quore can do for your hotel. |
