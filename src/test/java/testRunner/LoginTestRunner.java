package testRunner;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends BaseTestRunner {
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1)
    public void userLogin() {
        loginPage.navigateToSignInPage();
        loginPage.doLogin();
        loginPage.navigateToAlertsMenu();
    }

}
