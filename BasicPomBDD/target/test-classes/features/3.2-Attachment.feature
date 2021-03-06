Feature: Attachment Feature

  Scenario: user adds an attachment without comment
    Given user is on My info module
    When user clicks on add button under attachment
    And user clicks on choose file
    And user choose a file with the following path "C:\\Users\\dell\\Desktop\\wallpapers\\eagle wallpapers\\eagle 5.jpg"
    And user clicks on upload button
    Then the attachment "eagle 5.jpg" is displayed in the attachment's table

  Scenario: user adds an attachment with a comment
    Given user is on My info module
    When user clicks on add button under attachment
    And user clicks on choose file
    And user choose a file with the following path "C:\\Users\\dell\\Desktop\\wallpapers\\eagle wallpapers\\eagle 5.jpg"
    And user adds comment "This is my comment"
    And user clicks on upload button
    Then the attachment "eagle 5.jpg" is displayed in the attachment's table
    And the comment "This is my comment" is displayed for attachment "eagle 5.jpg"

  Scenario: user edits the attachment file
    Given The attachment "eagle 5.jpg" is displayed in the attachment table
    When user clicks on edit button for attachment "eagle 5.jpg"
    And user choose a file with the following path "C:\\Users\\dell\\Desktop\\wallpapers\\eagle wallpapers\\eagle 6.jpg"
    And user clicks on upload button
    Then the attachment "eagle 5.jpg" is replaced with "eagle 6.jpg" in the attachment's table

  Scenario: user edits the attachment's comment
    Given The attachment "eagle 6.jpg" is displayed in the attachment table
    When user clicks on edit button for attachment "eagle 6.jpg"
    And  user adds comment "This is my edited comment"
    And user clicks on save comment only button
    Then the comment "This is my edited comment" is displayed for attachment "eagle 6.jpg"

  Scenario: user edits the attachment's file along with the comment
    Given The attachment "eagle 6.jpg" is displayed in the attachment table
    When user clicks on edit button for attachment "eagle 6.jpg"
    And user choose a file with the following path "C:\\Users\\dell\\Desktop\\wallpapers\\eagle wallpapers\\eagle 5.jpg"
    And  user adds comment "This is my second edited comment"
    And user clicks on save comment only button
    Then the attachment "eagle 6.jpg" is replaced with "eagle 5.jpg" in the attachment's table
    And the comment "This is my second edited comment" is displayed for attachment "eagle 5.jpg"

  Scenario: user deletes the attachment
    Given The attachment "eagle 5.jpg" is displayed in the attachment table
    When user selects an attachment "eagle 5.jpg"
    And user click on delete button
    Then the attachment "eagle 5.jpg" is deleted




