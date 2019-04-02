package testHomePage;

import base.MobileAPI;
import homePage.ClickOnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestClickOnHomePage extends MobileAPI {
    @Test
    public void testAccess(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickOnHomePage clickOnHomePage = PageFactory.initElements(ad, ClickOnHomePage.class);
        clickOnHomePage.useClickMethods();
    }
}
