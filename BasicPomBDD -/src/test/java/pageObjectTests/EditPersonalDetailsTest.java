package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MenuItemScreen;
import pages.PersonalDetails;

import java.util.List;
import java.util.Map;

public class EditPersonalDetailsTest
{
    MenuItemScreen menuItemScreenObject=new MenuItemScreen(DriverConfig.getDriver());
    PersonalDetails personalDetailsObject=new PersonalDetails(DriverConfig.getDriver());
    @When("user navigates to {string} module")
    public void user_navigates_to_module(String string)
    {
        menuItemScreenObject.clickMenuItem(string);
    }

    @When("user clicks on edit button")
    public void user_clicks_on_edit_button()
    {
        personalDetailsObject.clickEditButton();
    }

    @When("user should edit his personal details form as follows")
    public void user_should_edit_his_personal_details_form_as_follows(io.cucumber.datatable.DataTable dataTable)
    {
        //List<Map<String, String>> data = dataTable.asMaps();
        Map<String,List<String>> table=dataTable.asMap(String.class,List.class);

        System.out.println(table.get("first name").get(1));
        personalDetailsObject.enterFirstName(table.get("first name").get(1));

        System.out.println(table.get("last name").get(1));
        personalDetailsObject.enterLastName(table.get("last name").get(1));

        System.out.println(table.get("gender").get(1));
        personalDetailsObject.selectGender(table.get("gender").get(1));

        System.out.println(table.get("date of birth").get(1));
        personalDetailsObject.setDateOfBirth(table.get("date of birth").get(1));

        System.out.println(table.get("marital status").get(1));
        personalDetailsObject.setMaritalStatus(table.get("marital status").get(1));

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button()
    {
        personalDetailsObject.clickEditButton();
    }


    @Then("personal details form should display")
    public void personalDetailsFormShouldDisplay(io.cucumber.datatable.DataTable dataTable)
    {
        Map<String,List<String>> table=dataTable.asMap(String.class,List.class);
        //System.out.println(data.get(0).get("first name"));
        Assert.assertEquals(table.get("first name").get(1),personalDetailsObject.getFirstNameText());
        Assert.assertEquals(table.get("last name").get(1),personalDetailsObject.getLastNameText());
        Assert.assertEquals(table.get("gender").get(1),personalDetailsObject.getGender());
        Assert.assertEquals(table.get("date of birth").get(1),personalDetailsObject.getDateOfBirth());
        Assert.assertEquals(table.get("marital status").get(1),personalDetailsObject.getMaritalStatus());
    }
}
