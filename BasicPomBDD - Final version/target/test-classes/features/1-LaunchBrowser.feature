Feature: Launch Browser
  Scenario: user launches the browser
    Given user launches chrome driver
    When user navigates to "https://opensource-demo.orangehrmlive.com"
    Then user is on the Login screen