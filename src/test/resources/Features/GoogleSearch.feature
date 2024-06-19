Feature: feature to test google search functionality

@googletest
  Scenario: Validate google search
    Given browser is open
    And user is on google page
    When user enters text to search
    And hits enter
    Then search results displayed
    And close browser
