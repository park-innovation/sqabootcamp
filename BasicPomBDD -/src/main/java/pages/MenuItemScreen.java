package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuItemScreen
{
    WebDriver driver;
    @FindBy(id = "menu_pim_viewMyDetails")
    private WebElement MyInfoMenuItem;
    @FindBy(id = "empPic")
    private WebElement myInfoProfile;
    public MenuItemScreen(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickMenuItem(String menuItem)
    {

        switch (menuItem)
        {
            case "My Info":
                    MyInfoMenuItem.click();
                break;

        }

    }
    public boolean myInfoIsClicked()
    {
      return   myInfoProfile.isDisplayed();
    }

}
