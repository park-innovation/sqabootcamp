//package pageObjectTests;
//
//import driverConfiguration.DriverConfig;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import pages.Attachments;
//
//public class DeleteAttachmentTest
//{
//    Attachments attachmentsObject= new Attachments(DriverConfig.getDriver());
//    int rows1=attachmentsObject.checkNbOfRows();
//    @When("user clicks on checkbox to the corresponding file {string}")
//    public void user_clicks_on_checkbox_to_the_corresponding_file(String string)
//    {
//
//        attachmentsObject.checkboxClick(string);
//    }
//
//    @When("user clicks on delete button")
//    public void user_clicks_on_delete_button()
//    {
//        attachmentsObject.clickDeleteButton();
//    }
//
//    @Then("the added file name should be deleted from the table")
//    public boolean theAddedFileNameShouldBeDeletedFromTheTable()
//    {
//        boolean res=false;
//        int rows2=attachmentsObject.checkNbOfRows();
//        try {
//            if(rows1==rows2)
//            {
//               res= true;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            res= false;
//        }
//        return res;
//
//    }
//}
