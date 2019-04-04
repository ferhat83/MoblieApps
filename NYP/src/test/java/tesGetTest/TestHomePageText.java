package tesGetTest;

import base.MobileAPI;
import getText.HomePageText;
import homePage.ClickOnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

public class TestHomePageText extends MobileAPI {
    @Test
    public void testAppTitle() {
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        HomePageText homePageText = PageFactory.initElements(ad, HomePageText.class);
        homePageText.textBritney();
    }
}
