package org.faraz.framework.helpers;

import org.faraz.framework.pagemodels.FindLocalAgentPage;
import org.faraz.framework.pagemodels.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindLocalAgentHelper {
    private WebDriver driver;
    private FindLocalAgentPage findLocalAgentPage;
    private WebDriverWait wait;

    public FindLocalAgentHelper(WebDriver driver){
        this.driver = driver;
        this.findLocalAgentPage = new FindLocalAgentPage(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForElementAvailability(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }


}
