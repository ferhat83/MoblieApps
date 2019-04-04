package testgetListOfElements;

import base.MobileAPI;
import getListOfElements.GetListOfElements;
import getWebElement.HomepageElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.MobileAPI.ad;
import static base.MobileAPI.convertToString;

public class TestGetListOfElements extends MobileAPI {

    @Test
    public void testHamburger() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        GetListOfElements getListOfElements = PageFactory.initElements(ad, GetListOfElements.class);
        getListOfElements.clickOnListOfElements();
    }
}
