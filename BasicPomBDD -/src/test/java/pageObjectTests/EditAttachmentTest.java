//package pageObjectTests;
//
//import driverConfiguration.DriverConfig;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import pages.Attachments;
//
//public class EditAttachmentTest
//{
//    Attachments attachmentsObject= new Attachments(DriverConfig.getDriver());
//    @Given("A row should exist in the attachments table")
//    public void a_row_should_exist_in_the_attachments_table()
//    {
//        Assert.assertTrue("a row should exist in the attachments table",attachmentsObject.rowExist());
//    }
//
//    @When("user clicks on edit link to the corresponding file {string}")
//    public void user_clicks_on_edit_link_to_the_corresponding_file(String string)
//    {
//        attachmentsObject.clickEditLink(string);
//    }
//
//
//}
