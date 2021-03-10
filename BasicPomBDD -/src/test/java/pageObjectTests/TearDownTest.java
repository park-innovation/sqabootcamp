package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TearDownTest
{
    @Given("Browser is opened")
    public void browser_is_opened()
    {
        Assert.assertNotEquals(null, DriverConfig.getDriver());

    }

    @When("user closes the browser")
    public void user_closes_the_browser()
    {
        DriverConfig.quitDriver();
    }

    @Then("Browser should be closed")
    public void browser_should_be_closed()
    {
        Assert.assertEquals(null,DriverConfig.getDriver());
    }
}
