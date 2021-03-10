package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Attachments
{
    WebDriver driver;
    @FindBy(id = "btnAddAttachment")
    private WebElement addButton;
    @FindBy(id = "btnDeleteAttachment")
    private WebElement deleteButton;
    @FindBy(id = "ufile")
    private WebElement chooseFileButton;
    @FindBy(id = "btnSaveAttachment")
    private WebElement uploadButton;
//    @FindBy(xpath = "//table/tbody/tr")
//    private WebElement tr;
    @FindBy(id = "txtAttDesc")
    private WebElement commentTextBox;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "btnCommentOnly")
    private WebElement saveCommentOnly;

    public Attachments (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddButton() {

        addButton.click();
    }
    public void ChoosesAFile(String filepath)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chooseFileButton.sendKeys(filepath);
    }
    public void addComment(String commentText)
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        commentTextBox.clear();
        commentTextBox.sendKeys(commentText);
    }
    public void clickUploadButton()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uploadButton.click();
    }
    public boolean checkFileName(String fileName)
    {
       return driver.findElement(By.xpath("//table[@id='tblAttachments']/tbody/tr/td/a[normalize-space(text())='"+fileName+"']")).isDisplayed();
    }

    public boolean checkFileNameDeletd(String fileName)
    {
        return driver.findElements(By.xpath("//table[@id='tblAttachments']/tbody/tr/td/a[normalize-space(text())='"+fileName+"']")).isEmpty();
    }

    public boolean checkComment_FileName(String fileName,String commentText)
    {
      return  driver.findElement(By.xpath("//td/a[normalize-space(text())='"+fileName+"']/ancestor::tr/td[normalize-space(text())='"+commentText+"']")).isDisplayed();

    }
//    public boolean rowExist()
//    {
//        return tr.isDisplayed();
//    }
    public void clickEditLink(String filename)
    {
        driver.findElement(By.xpath("//td/a[normalize-space(text())='"+filename+"']/ancestor::tr/td/a[@class='editLink']")).click();
    }
    public void clickCheckbox(String file)
    {
        driver.findElement(By.xpath("//a[normalize-space(text())='"+file+"']/ancestor::tr/td/input[@class='checkboxAtch']")).click();
    }
    public void clickDeleteButton()
    {
        deleteButton.click();
    }
//    public int checkNbOfRows()
//    {
//        List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
//         int rows_count = rows_table.size();
//         return rows_count;
//    }
    public void clickSaveCommentOnly()
    {
        saveCommentOnly.click();
    }
}
