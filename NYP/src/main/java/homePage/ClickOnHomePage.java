package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


import static base.MobileAPI.convertToString;

public class ClickOnHomePage extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Turn On Notifications\"]")
    public static WebElement alert;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    public static WebElement hamburgerButton;
    @FindBy(id = "br.com.golmobile.nypost:id/logo_header")
    public static WebElement appTitle;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[3]\n")
    public static WebElement fashion;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[2]\n")
    public static WebElement entertainment;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[2]\n")
    public static WebElement britney;

    //getter
    public static WebElement getAlert() {
        return alert;
    }
    public static WebElement getHamburgerButton() {
        return hamburgerButton;
    }
    public static WebElement getAppTitle() { return appTitle; }
    public static WebElement getFashion(){return fashion;}
    public static WebElement getEntertainment(){return entertainment;}
    public static WebElement getBritney(){return britney;}

    //runMethods

    public void clickOnHamburger(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().click();
    }
    public void getTestAppTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().getText();
    }
    public void clickOnHamburgerFashion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().click();
        getFashion().click();
    }
    public void clickOnHamburgerEntertainment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().click();
        getEntertainment().click();
    }
    public void clickOnBritney(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getBritney().click();
    }
}
