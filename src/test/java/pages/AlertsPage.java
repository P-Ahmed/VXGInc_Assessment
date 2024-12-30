package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverSetup;

public class AlertsPage extends BasePage {
    @FindBy(xpath = "//button[normalize-space()='Site']")
    WebElement siteButton;
    @FindBy(css = "input[placeholder='Search site...']")
    WebElement siteSearchInputField;
    @FindBy(xpath = "//div[contains(text(),'No site found.')]")
    WebElement siteSearchValidation;
    @FindBy(xpath = "//button[normalize-space()='Toronto']")
    WebElement siteTorontoButton;
    @FindBy(xpath = "//span[normalize-space()='Office']")
    WebElement siteOffice;
    @FindBy(xpath = "//button[normalize-space()='Office']")
    WebElement siteOfficeButton;
    @FindBy(xpath = "//span[normalize-space()='Camera: All']")
    WebElement cameraButton;
    @FindBy(xpath = "//span[normalize-space()='Axis office']")
    WebElement cameraAxisOffice;
    @FindBy(xpath = "//button[normalize-space()='Name']")
    WebElement nameButton;
    @FindBy(css = "input[placeholder='Search rule name...']")
    WebElement nameSearchInputField;
    @FindBy(xpath = "//div[contains(text(),'No alert found.')]")
    WebElement nameSearchValidation;
    @FindBy(xpath = "//button[normalize-space()='Open door']")
    WebElement nameOpenDoorButton;
    @FindBy(xpath = "//div[@id=':rc:']")
    WebElement nameOpenDoor;
    @FindBy(xpath = "//span[normalize-space()='Last 30 days']")
    WebElement daysDropDown;
    @FindBy(xpath = "//span[normalize-space()='Last 7 days']")
    WebElement sevenDaysDropDown;
    @FindBy(className = "main-select")
    WebElement columnPicker;
    @FindBy(xpath = "//span[normalize-space()='Time']")
    WebElement timeColumn;
    @FindBy(xpath = "//span[normalize-space()='Name']")
    WebElement nameColumn;
    @FindBy(xpath = "//span[normalize-space()='Status']")
    WebElement statusColumn;
    @FindBy(xpath = "//span[normalize-space()='Type']")
    WebElement typeColumn;
    @FindBy(xpath = "//div[contains(text(),'Time')]")
    WebElement timeFromTable;
    @FindBy(xpath = "//div[contains(text(),'Type')]")
    WebElement typeFromTable;
    @FindBy(xpath = "//div[contains(text(),'Status')]")
    WebElement statusFromTable;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
    WebElement reviewButton;
    @FindBy(xpath = "//div[normalize-space()='ChatGPT Request:']")
    WebElement chatGPTRequestLabel;

    public AlertsPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    public void searchInSite() {
        clickAndWait(siteButton);
        clickAndType(siteSearchInputField, "toronto");
        siteSearchInputField.sendKeys(Keys.ENTER);
        presenceOfElement(siteTorontoButton);
    }

    public void searchValidationInSite() {
        pageRefresh();
        clickAndWait(siteButton);
        clickAndType(siteSearchInputField, "sfue");
        presenceOfElement(siteSearchValidation);
    }

    public void selectSite() {
        pageRefresh();
        clickAndWait(siteButton);
        clickAndWait(siteOffice);
        presenceOfElement(siteOfficeButton);
    }

    public void pageRefresh() {
        DriverSetup.getDriver().navigate().refresh();
    }

    public void selectCamera() {
        pageRefresh();
        clickAndWait(cameraButton);
        clickAndWait(cameraAxisOffice);

        presenceOfElement(cameraAxisOffice);
    }

    public void searchInName() {
        pageRefresh();
        clickAndWait(nameButton);
        clickAndType(nameSearchInputField, "open door");
        nameSearchInputField.sendKeys(Keys.ENTER);
        presenceOfElement(nameOpenDoorButton);
    }

    public void searchValidationInName() {
        pageRefresh();
        clickAndWait(nameButton);
        clickAndType(nameSearchInputField, "sfue");
        presenceOfElement(nameSearchValidation);
    }

    public void selectName() {
        pageRefresh();
        clickAndWait(nameButton);
        clickAndWait(nameOpenDoor);
        presenceOfElement(nameOpenDoor);
    }

    public void selectDays() {
        pageRefresh();
        clickAndWait(daysDropDown);
        clickAndWait(sevenDaysDropDown);

        presenceOfElement(sevenDaysDropDown);
    }

    public void timeColumnValidation() {
        clickAndWait(columnPicker);
        clickAndWait(timeColumn);
        presenceOfElement(timeFromTable);
        clickAndWait(timeColumn);
    }

    public void typeColumnValidation() {
        clickAndWait(typeColumn);
        presenceOfElement(typeFromTable);
        clickAndWait(typeColumn);
    }

    public void statusColumnValidation() {
        clickAndWait(statusColumn);
        presenceOfElement(statusFromTable);
        clickAndWait(statusColumn);
    }

    public void reviewAlerts(){
        clickAndWait(reviewButton);
        presenceOfElement(chatGPTRequestLabel);
    }
}
