package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails
{
    WebDriver driver;
    @FindBy(id = "btnSave")
    private WebElement editButton;
    @FindBy(id = "personal_txtEmpFirstName")
    private WebElement firstName;
    @FindBy(id = "personal_txtEmpLastName")
    private WebElement lastName;
    @FindBy(id = "personal_optGender_1")
    private WebElement maleGender;
    @FindBy(id = "personal_optGender_2")
    private WebElement femaleGender;
    @FindBy(id = "personal_cmbMarital")
    private WebElement maritalStatus;
    @FindBy(id = "personal_DOB")
    private WebElement dateOfBirth;
    @FindBy (xpath="//label[@for='personal_optGender_1']")
    private WebElement maleGenderLabel;
    @FindBy (xpath="//label[@for='personal_optGender_2']")
    private WebElement femaleGenderLabel;
    @FindBy (xpath = "//select[@id='personal_cmbMarital']/option[@selected='selected']")
    private WebElement selectedMaritalStatus;




    public PersonalDetails(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickEditButton()
    {
        editButton.click();
    }
    public void enterFirstName(String fName)
    {
     firstName.clear();
        firstName.sendKeys(fName);
    }
    public void enterLastName(String lName)
    {
        lastName.clear();
        lastName.sendKeys(lName);
    }
    public void selectGender(String genderType)
    {
        switch (genderType)
        {
            case "Female":
            case "female":
                femaleGender.click();
                break;
            case "Male":
            case "male":
                maleGender.click();
                break;
        }
    }
    public void setDateOfBirth(String dob)
    {
        dateOfBirth.clear();
        dateOfBirth.sendKeys(dob);
    }
    public void setMaritalStatus(String maritalStatus1)
    {
     driver.findElement(By.xpath("//select[@id='personal_cmbMarital']/option[@value='"+maritalStatus1+"']")).click();
    }
public String getFirstNameTest(){
        return firstName.getAttribute("value");
}
public String getLastNameTest(){
        return lastName.getAttribute("value");
}
    public String getGender() {
        String genderText=" ";
        if (maleGender.isSelected()) {
            genderText = maleGenderLabel.getText();

        }

        else if (femaleGender.isSelected()){
            genderText=femaleGenderLabel.getText();
            }
        return genderText;

    }
    public String getDateOfBirth(){
        return dateOfBirth.getAttribute("value");

    }
    public String getMaritalStatus(){
      return selectedMaritalStatus.getText();
    }
}
