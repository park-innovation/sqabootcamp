Feature: Admin logout Feature
  Scenario: Admin successfully logout
    Given user should be on home screen
    When user clicks on welcome icon
    And user clicks on logout link
    Then user is on the Login screen
