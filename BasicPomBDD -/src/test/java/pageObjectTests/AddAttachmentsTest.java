//package pageObjectTests;
//
//import driverConfiguration.DriverConfig;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import pages.Attachments;
//import pages.MenuItemScreen;
//
//public class AddAttachmentsTest
//{
//    Attachments attachmentsObject= new Attachments(DriverConfig.getDriver());
//    MenuItemScreen menuItemScreenObject=new MenuItemScreen(DriverConfig.getDriver());
//    @Given("user should be on My Info module")
//    public void userShouldBeOnMyInfoModule()
//    {
//        Assert.assertTrue("user clicked on MyInfo menu item",menuItemScreenObject.myInfoIsClicked());
//    }
//    @When("user clicks on Add button")
//    public void user_clicks_on_add_button()
//    {
//        attachmentsObject.clickAddButton();
//    }
//
//
//    @When("user chooses file from {string}")
//    public void user_chooses_file_from(String string)
//    {
//        attachmentsObject.ChoosesAFile(string);
//    }
//
//    @When("user clicks on upload button")
//    public void user_clicks_on_upload_button()
//    {
//        attachmentsObject.clickUploadButton();
//    }
//
//
//    @Then("the added file name {string} should be displayed in the table")
//    public void theAddedFileNameShouldBeDisplayedInTheTable(String arg0)
//    {
//       Assert.assertTrue(attachmentsObject.checkFileName(arg0));
//    }
//}
