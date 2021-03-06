Feature: Admin Login Feature
  Scenario: Admin login using valid credentials
    Given user is on the Login screen
    When user enters username "Admin" and password "admin123"
    And user clicks on login button
    Then user should be on home screen