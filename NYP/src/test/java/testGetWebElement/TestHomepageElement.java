package testGetWebElement;

import base.MobileAPI;
import getWebElement.HomepageElement;
import homePage.ClickOnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestHomepageElement extends MobileAPI {
    @Test
    public void testAlert() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomepageElement homepageElement = PageFactory.initElements(ad, HomepageElement.class);
        homepageElement.getAlertElement();
    }
    @Test
    public void testHamburger() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomepageElement homepageElement = PageFactory.initElements(ad, HomepageElement.class);
        homepageElement.getHamburgerElement();
    }
    @Test
    public void testBritneyTitleElement() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomepageElement homepageElement = PageFactory.initElements(ad, HomepageElement.class);
        homepageElement.getBritneyTitleElement();
    }
    @Test
    public void testTitleElement() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomepageElement homepageElement = PageFactory.initElements(ad, HomepageElement.class);
        homepageElement.getTitleElement();
    }
}
