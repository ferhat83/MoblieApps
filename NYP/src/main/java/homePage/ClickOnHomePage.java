package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.MobileAPI.convertToString;

public class ClickOnHomePage extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Share\"]\n")
    public static WebElement alert;
    @FindBy(xpath = " //android.widget.ImageButton[@content-desc=\"Open menu\"]")
    public static WebElement hamburgerButton;
    //getter
    public static WebElement getAlert() {
        return alert;
    }
    public static WebElement getHamburgerButton() {
        return hamburgerButton;
    }


    //runMethods
    public void clickOnAlert() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getAlert().click();
    }
    public void clickOnHamburger(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().click();
    }

    //use run methods
    public void useClickMethods(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickOnAlert();
        clickOnHamburger();
    }

}
