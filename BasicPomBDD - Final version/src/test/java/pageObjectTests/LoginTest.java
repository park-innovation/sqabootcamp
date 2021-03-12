package pageObjectTests;

import driverConfiguration.DriverConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomeScreen;
import pages.LoginScreen;

public class LoginTest
{
    LoginScreen loginScreenObject=new LoginScreen(DriverConfig.getDriver());
    HomeScreen homeScreenObject=new HomeScreen(DriverConfig.getDriver());

   /*@Before
    public void setUp()
    {
       driverConfig=new DriverConfig();
       driver=driverConfig.createDriver("chrome");
       driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
       loginScreenObject=new LoginScreen(driver);
       homeScreenObject=new HomeScreen(driver);
    }*/
    /*@After
    public void quitDriver()
    {
        driverConfig.quitDriver();
    }*/
    @Given("user is on the Login screen")
    public void user_is_on_the_login_screen()
    {
        Assert.assertTrue("user in not on LoginScreen",loginScreenObject.verifyUserOnLoginScreen());
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2)
    {
        loginScreenObject.enterUserName(string);
        loginScreenObject.enterPassword(string2);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button()
    {
        loginScreenObject.clickLoginButton();
    }

    @Then("user should be on home screen")
    public void user_should_be_on_home_screen()
    {
        Assert.assertTrue("user in not on HomeScreen",homeScreenObject.verifyUserOnHomeScreen());

    }


}
