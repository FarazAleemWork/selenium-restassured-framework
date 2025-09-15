package org.faraz.framework.helpers;

import org.faraz.framework.pagemodels.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageHelper {
    private WebDriver driver;
    private HomePage homePage;
    private WebDriverWait wait;

    public HomePageHelper(WebDriver driver){
        this.driver = driver;
        this.homePage = new HomePage(this.driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForElementAvailability(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    /**
     * Select options from dropdown. Options are
     * 1. Auto Insurance 2. Home Insurance 3. Condo Insurance 4. Renters Insurance
     * @param insuranceProductOptions "
     */
    public void selectInsuranceProductFromDropdown(String insuranceProductOptions){
        waitForElementAvailability(homePage.getInsuranceProductDropdown());
        Select selectFromDropdown = new Select(homePage.getInsuranceProductDropdown());
        selectFromDropdown.selectByVisibleText(insuranceProductOptions);
    }

    public void enterZipCodeInTextField(String zipCode){
        waitForElementAvailability(homePage.getZipCodeTextField());
        homePage.getZipCodeTextField().sendKeys(zipCode);
    }

    public void clickGetAQuotBtn(){
        waitForElementAvailability(homePage.getGetAQuoteBtn());
        homePage.getGetAQuoteBtn().click();
    }

    public void clickFindAnAgentLink(){
        waitForElementAvailability(homePage.getFindAnAgentLink());
        homePage.getFindAnAgentLink();
    }
}
