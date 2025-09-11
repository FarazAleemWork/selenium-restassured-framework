package org.faraz.framework.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getChromeDriver(){
        ReadConfigFile readConfigFileReader = new ReadConfigFile();
        try{
            if(driver==null) {
                String chromePath = readConfigFileReader.getChromeDriverPath();
                System.setProperty("webdriver.chrome.driver", chromePath);
                driver = new ChromeDriver();
                System.out.println("ChromeDriver initialized successfully.");
            }
        }catch(Exception e){
            System.err.println("Driver initialization failed " + e.getMessage());
            throw new RuntimeException(e);
        }
        return driver;
    }

    public static void quitDriver(){
        try{
            if (driver != null){
                driver.quit();
                driver = null;
                System.out.println("ChromeDriver quit successfully.");
            }
        }catch (Exception e){
            System.err.println("Unable to quit driver " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
