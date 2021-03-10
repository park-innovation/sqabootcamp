#Feature: Attachments feature
#  Scenario: Admin adds attachment on My Info module
#    Given user should be on My Info module
#    When user clicks on Add button
#    And user chooses file from "C:\Users\Dell\Desktop\emails.txt"
#    And user clicks on cancel button
#    And user clicks on Add button
#    And user chooses file from "C:\Users\Dell\Desktop\emails.txt"
#    And user adds "this is an emails folder" in the comment textarea
#    And user clicks on upload button
#    Then the added file name "emails.txt" should be displayed in the table
#
#    Scenario: Admin edits an attachment from the attachment table
#      Given A row should exist in the attachments table
#      When user clicks on edit link to the corresponding file "emails.txt"
#      And user adds "this is an emails folder" in the comment textarea
#      And user clicks on saveCommentOnly button
#      And user clicks on edit link to the corresponding file "emails.txt"
#      And user chooses file from "C:\Users\Dell\Desktop\links.txt"
#      And user adds "this is a links folder" in the comment textarea
#      And user clicks on upload button
#      Then the added file name "links.txt" should be displayed in the table
#
#    Scenario: Admin deletes an attachment from the attachment table
#      Given A row should exist in the attachments table
#      When user clicks on checkbox to the corresponding file "links.txt"
#      And user clicks on delete button
#      Then the added file name should be deleted from the table