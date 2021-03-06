Feature: Personal details feature

  Scenario: Admin edits personal details on My Info module
    Given user should be on home screen
    When user navigates to "My Info" module
    And user clicks on edit button
    And user should edit his personal details form as follows
      | first name      |  | Rawad      |
      | last name       |  | kadi       |
      | gender          |  | Male       |
      | date of birth   |  | 2002-01-18 |
      | marital status |  | Single     |
    And user clicks on save button
    Then personal details form should display
      | first name      |  | Rawad      |
      | last name       |  | kadi       |
      | gender          |  | Male       |
      | date of birth   |  | 2002-01-18 |
      | marital status |  | Single     |