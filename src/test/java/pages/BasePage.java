package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverSetup;

import java.time.Duration;

public class BasePage {
    public WebDriverWait wait = new WebDriverWait(DriverSetup.getDriver(), Duration.ofSeconds(5));

    public void presenceOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickAndType(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        element.sendKeys(text);
    }

    public void clickAndWait(WebElement element) {
        presenceOfElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
