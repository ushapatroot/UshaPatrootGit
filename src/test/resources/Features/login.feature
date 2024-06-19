
@SmokeFeature
Feature: feature to test login functionality


@smoketest
  Scenario: Check successful login with valid credentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is logged in successfully
