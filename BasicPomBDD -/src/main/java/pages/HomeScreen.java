package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen
{
    WebDriver driver;
    @FindBy(id = "welcome")
    private WebElement welcomeText;
    //@FindBy(linkText = "Logout")
    //private WebElement logoutLink;
    @FindBy(xpath = "//a[text()='Logout']")
     private WebElement logoutLink;
    //@FindBy(xpath = "//a[@id ='aboutDisplayLink']/../following-sibling::li/a")
    // private WebElement logoutLink;

    //constructor with parameter the driver
    public HomeScreen(WebDriver driver)
    {
        this.driver=driver;
        //whenever u call the constructor of this page it will initialize the elements and "this" is for the class
        PageFactory.initElements(driver,this);
    }
    //actions of the element
    public void clickWelcomeText()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        welcomeText.click();
    }
    public void clickLogout()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logoutLink.click();
    }
    public boolean verifyUserOnHomeScreen()
    {
        return welcomeText.isDisplayed();
    }
}
