package org.faraz.framework.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTestClass {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        ReadConfigFile readConfigFile = new ReadConfigFile();
        driver = DriverManager.getChromeDriver();
        driver.manage().window().maximize();
        driver.get(readConfigFile.getBaseUrlUi());
        System.out.println();
        System.out.println("Browser launched and navigated to: " + readConfigFile.getBaseUrlUi());
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Closing Browser");
        DriverManager.quitDriver();
        System.out.println("Browser Closed");
    }

    public WebDriver getDriver() {
        return driver;
    }

}
