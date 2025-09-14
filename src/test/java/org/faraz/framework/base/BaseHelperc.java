package org.faraz.framework.base;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class BaseHelperc {
    private final WebDriver driver;

    public BaseHelperc(WebDriver driver) {
        this.driver = driver;
    }
    public void validateCurrentUrl(String expectedUrl){
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "Navigated to expected Url");
    }
}
