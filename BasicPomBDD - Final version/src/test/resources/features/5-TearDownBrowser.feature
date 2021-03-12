Feature: Tear Down Browser
  Scenario: User tear down browser
    Given Browser is opened
    When user closes the browser
    Then Browser should be closed