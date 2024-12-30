package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverSetup;

public class LoginPage extends BasePage {
    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    WebElement signInButton;
    @FindBy(css = "a[href='/customer/alerts']")
    WebElement alertsMenu;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    public LoginPage() {
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }

    public void navigateToSignInPage() {
        DriverSetup.getDriver().get("http://cloudtwo.cloud-vms.com/customer/alerts");
    }

    public void doLogin() {
        clickAndType(email, "dev@testing.com");
        clickAndType(password, "123456");

        clickAndWait(signInButton);
    }

    public void navigateToAlertsMenu() {
        clickAndWait(alertsMenu);
    }

}
