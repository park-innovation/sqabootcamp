Feature: Attachment feature

  Scenario: user adds an attachment without comment
    Given user is on My Info module
    When user clicks on add button under attachment
    And user choose a file with the following path "C:\Users\Dell\Desktop\jenkins.txt"
    And user clicks on upload Button
    Then the attachment "jenkins.txt" is displayed in the attachment table

  Scenario: user adds an attachment with comment
    Given user is on My Info module
    When user clicks on add button under attachment
    And user choose a file with the following path "C:\Users\Dell\Desktop\emails.txt"
    And user adds comment "this is an emails text folder"
    And user clicks on upload Button
    Then the attachment "emails.txt" is displayed in the attachment table
    And the comment "this is an emails text folder" is displayed for attachment "emails.txt"

  Scenario: user edits the attachment file
    Given the attachment "emails.txt" is displayed in the attachment table
    When user clicks on edit button for attachment "emails.txt"
    And user choose a file with the following path "C:\Users\Dell\Desktop\links.txt"
    And user clicks on upload Button
    Then the attachment "emails.txt" is replaced with "links.txt" in the attachment table

  Scenario: user edits the attachment comment
    Given the attachment "links.txt" is displayed in the attachment table
    When user clicks on edit button for attachment "links.txt"
    And user adds comment "this is a links text folder"
    And user clicks on saveCommentOnly button
    Then the comment "this is a links text folder" is displayed for attachment "links.txt"

  Scenario: the user edits the attachment file along with the comment
    Given the attachment "links.txt" is displayed in the attachment table
    When user clicks on edit button for attachment "links.txt"
    And user choose a file with the following path "C:\Users\Dell\Desktop\emails.txt"
    And user adds comment "this is an emails text folder"
    And user clicks on upload Button
    Then the attachment "links.txt" is replaced with "emails.txt" in the attachment table
    And the comment "this is an emails text folder" is displayed for attachment "emails.txt"

  Scenario: user deletes an attachment
    Given the attachment "jenkins.txt" is displayed in the attachment table
    When user selects an attachment "jenkins.txt"
    And user clicks on delete button
    Then the attachment "jenkins.txt" is deleted