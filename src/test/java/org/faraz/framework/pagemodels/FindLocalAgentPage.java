package org.faraz.framework.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindLocalAgentPage {
    private final WebDriver driver;

    public FindLocalAgentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkBoxAutoXpath = "//label[normalize-space(.)='Auto']";
    public WebElement getCheckBoxAuto(){
        return driver.findElement(By.xpath(checkBoxAutoXpath));
    }

    public String checkBoxHomeXpath = "//label[normalize-space(.)='Auto']";
    public WebElement getCheckBoxHome(){
        return driver.findElement(By.xpath(checkBoxHomeXpath));
    }

    public String checkBoxBusinessOwnersXpath = "//label[normalize-space(.)='Business Owners']";
    public WebElement getCheckBoxBusinessOwners(){
        return driver.findElement(By.xpath(checkBoxBusinessOwnersXpath));
    }

    public String checkBoxBusinessAutoXpath = "//label[normalize-space(.)='Business Auto']";
    public WebElement getCheckBoxBusinessAuto(){
        return driver.findElement(By.xpath(checkBoxBusinessAutoXpath));
    }

    public String zipCodeTextFieldXpath = "//input[@id = 'zipcode']";
    public WebElement getZipCodeTextField(){
        return driver.findElement(By.xpath(zipCodeTextFieldXpath));
    }

    public String findLocalAgentBtnCssSelector = "#submit-menu-faa";
    public WebElement getFindLocalAgentBtn(){
        return driver.findElement(By.cssSelector(findLocalAgentBtnCssSelector));
    }
}
