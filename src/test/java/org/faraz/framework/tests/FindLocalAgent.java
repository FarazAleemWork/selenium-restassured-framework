package org.faraz.framework.tests;

import org.faraz.framework.base.BaseHelperc;
import org.faraz.framework.base.BaseTestClass;
import org.faraz.framework.base.DriverManager;
import org.faraz.framework.helpers.HomePageHelper;
import org.faraz.framework.pagemodels.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FindLocalAgent extends BaseTestClass {

    BaseHelperc baseHelper = new BaseHelperc(getDriver());
    HomePageHelper homePageHelper = new HomePageHelper(getDriver());
    @Test
    public void findLocalAgentTest() throws InterruptedException {
        baseHelper.validateCurrentUrl("https://www.mercuryinsurance.com/");
        homePageHelper.clickFindAnAgentLink();

    }
}

        /* will use later probably

        homePageHelper.selectInsuranceProductFromDropdown("Renters Insurance");
        homePageHelper.enterZipCodeInTextField("13790");
        homePageHelper.clickGetAQuotBtn();*/