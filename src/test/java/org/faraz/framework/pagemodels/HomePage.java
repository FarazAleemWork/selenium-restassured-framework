package org.faraz.framework.pagemodels;

import org.faraz.framework.base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String insuranceProductDropdownID = "product-dropdown";
    public WebElement getInsuranceProductDropdown(){
        return driver.findElement(By.id(insuranceProductDropdownID));
    }

    public String zipCodeTextFieldXpath ="//input[@id='gaq-zip-code']";
    public WebElement getZipCodeTextField(){
        return driver.findElement(By.xpath(zipCodeTextFieldXpath));
    }

    public String getAQuoteBtnXpath = "//button[text()='Get a Quote']";
    public WebElement getGetAQuoteBtn(){
        return driver.findElement(By.xpath(getAQuoteBtnXpath));
    }

    public String findAnAgentLinkXpath = "//a[text()='Find an Agent']/img";
    public WebElement getFindAnAgentLink(){
        return driver.findElement(By.xpath(findAnAgentLinkXpath));
    }
}
