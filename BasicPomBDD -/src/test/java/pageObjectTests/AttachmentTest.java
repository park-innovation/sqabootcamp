package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Attachments;
import pages.MenuItemScreen;

import java.util.NoSuchElementException;

public class AttachmentTest
{
    Attachments attachmentsObject= new Attachments(DriverConfig.getDriver());
      MenuItemScreen menuItemScreenObject=new MenuItemScreen(DriverConfig.getDriver());

 //Add Attachment without comment
    @Given("user is on My Info module")
    public void user_is_on_my_info_module()
    {
        Assert.assertTrue("user clicked on MyInfo menu item",menuItemScreenObject.myInfoIsClicked());
    }

    @When("user clicks on add button under attachment")
    public void user_clicks_on_add_button_under_attachment()
    {
        attachmentsObject.clickAddButton();
    }

    @When("user choose a file with the following path {string}")
    public void user_choose_a_file_with_the_following_path(String string)
    {
        attachmentsObject.ChoosesAFile(string);
    }

    @When("user clicks on upload Button")
    public void user_clicks_on_upload_button()
    {
        attachmentsObject.clickUploadButton();
    }

    @Then("the attachment {string} is displayed in the attachment table")
    public void the_attachment_is_displayed_in_the_attachment_table(String string)
    {
        Assert.assertTrue(attachmentsObject.checkFileName(string));
    }
//Add Attachment with comment


    @When("user adds comment {string}")
    public void user_adds_comment(String string)
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        attachmentsObject.addComment(string);
    }

    @Then("the comment {string} is displayed for attachment {string}")
    public void the_comment_is_displayed_for_attachment(String string, String string2)
    {
        Assert.assertTrue(attachmentsObject.checkComment_FileName(string2,string));
    }

    //user edits the attachment file
    @When("user clicks on edit button for attachment {string}")
    public void user_clicks_on_edit_button_for_attachment(String string)
    {
        attachmentsObject.clickEditLink(string);
    }

    @Then("the attachment {string} is replaced with {string} in the attachment table")
    public void the_attachment_is_replaced_with_in_the_attachment_table(String string, String string2)
    {
        //Assert.assertFalse(attachmentsObject.checkFileName(string));
        Assert.assertTrue(attachmentsObject.checkFileNameDeletd(string));
        Assert.assertTrue(attachmentsObject.checkFileName(string2));
    }

 //user edits the attachment comment
 @When("user clicks on saveCommentOnly button")
 public void user_clicks_on_save_comment_only_button()
 {
    attachmentsObject.clickSaveCommentOnly();
 }

//user deletes an attachment

    @When("user selects an attachment {string}")
    public void user_selects_an_attachment(String string)
    {
        attachmentsObject.clickCheckbox(string);
    }

    @When("user clicks on delete button")
    public void user_clicks_on_delete_button()
    {
        attachmentsObject.clickDeleteButton();
    }

    @Then("the attachment {string} is deleted")
    public void the_attachment_is_deleted(String string)
    {
        Assert.assertTrue(attachmentsObject.checkFileNameDeletd(string));
    }


}
