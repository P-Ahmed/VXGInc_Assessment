package testRunner;

import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTestRunner extends BaseTestRunner {
    AlertsPage alertsPage = new AlertsPage();

    @Test(priority = 1)
    public void siteFunctionality() {
        alertsPage.searchInSite();
        alertsPage.searchValidationInSite();
        alertsPage.selectSite();
    }

    @Test(priority = 2)
    public void cameraFunctionality() {
        alertsPage.selectCamera();
    }

    @Test(priority = 3)
    public void nameFunctionality() {
        alertsPage.searchInName();
        alertsPage.searchValidationInName();
        alertsPage.selectName();
    }

    @Test(priority = 4)
    public void daysFunctionality() {
        alertsPage.selectDays();
    }

    @Test(priority = 5)
    public void columnFunctionality() {
        alertsPage.columnValidation();
    }

    @Test(priority = 6)
    public void reviewAlertWindow() {
        alertsPage.reviewAlerts();
    }
}
