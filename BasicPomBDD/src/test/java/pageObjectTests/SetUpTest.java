package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SetUpTest
{

   static WebDriver driver;


    @Given("user launches chrome driver")
    public void user_launches_chrome_driver()
    {

        driver=DriverConfig.createDriver("chrome");
    }

    @When("user navigates to {string}")
    public void user_navigates_to(String string)
    {
        driver.get(string);

    }

}
