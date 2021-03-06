package driverConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class DriverConfig
{
    //Dalia did a change
    //static i want to refer to it from outside
    private static WebDriver driver;

    public static WebDriver createDriver(String driverType)
    {

        if(driverType.toLowerCase().equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
           //opens the chrome driver
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        if(driverType.toLowerCase().equals("firefox"))
        {
            //System.setProperty("webdriver.chrome.driver","firefox\\driverlocation ");
            //driver = new FireFoxDriver();

        }
        return driver;
    }
    //i'm able to get the driver
    public static WebDriver getDriver()
    {
        return driver;
    }
    public static void quitDriver()
    {
        if(driver!=null)
        {
            driver.quit();
        }
        driver=null;
    }
}
