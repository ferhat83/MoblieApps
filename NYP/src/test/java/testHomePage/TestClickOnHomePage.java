package testHomePage;

import base.MobileAPI;
import homePage.ClickOnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class TestClickOnHomePage extends MobileAPI {
    @Test
    public void testHamburger(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.clickOnHamburger();
    }
    @Test
    public void testAlert(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.getAlert();
    }
    @Test
    public void testAppTitle(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.getTestAppTitle();
    }
    @Test
    public void testFashion(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.clickOnHamburgerFashion();
    }
    @Test
    public void testEntertainment(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.clickOnHamburgerEntertainment();
    }
    @Test
    public void testBritney(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.clickOnBritney();
    }
}
