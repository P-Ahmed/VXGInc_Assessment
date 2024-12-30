package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.DriverSetup;

public class BaseTestRunner {
    @BeforeTest
    public void browserSetupUsingConfigProperties() {
        DriverSetup.setThreadDriverName("chrome");
    }

    @AfterTest
    public void tearDown() {
        DriverSetup.quitDriver();
    }
}
