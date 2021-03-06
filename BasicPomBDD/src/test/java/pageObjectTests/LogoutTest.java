package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.en.When;
import pages.HomeScreen;

public class LogoutTest
{
    HomeScreen homeScreenObject=new HomeScreen(DriverConfig.getDriver());
    @When("user clicks on welcome icon")
    public void user_clicks_on_welcome_icon()
    {
        homeScreenObject.clickWelcomeText();
    }

    @When("user clicks on logout link")
    public void user_clicks_on_logout_link()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        homeScreenObject.clickLogout();
    }


}
