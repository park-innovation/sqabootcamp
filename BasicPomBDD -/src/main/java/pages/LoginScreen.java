package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen
{
    WebDriver driver;
    //using page factory
    @FindBy(id = "logInPanelHeading")
    private WebElement loginPanelText;
    @FindBy(name = "txtUsername")
    private WebElement userNameTextField;
    @FindBy(name="txtPassword")
    private WebElement passwordTextField;
    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public LoginScreen(WebDriver driver)
    {
        //takes global driver and it takes the parameter that i passed to it
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }

    public boolean verifyUserOnLoginScreen()
    {
        return loginPanelText.isDisplayed();
    }

    public void enterUserName(String userName)
    {
        userNameTextField.sendKeys(userName);
    }

    public void enterPassword(String password)
    {
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

}
