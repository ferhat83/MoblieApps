package dataBase;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.MobileAPI.convertToString;

public class SearchUsingDB extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]")
    public static WebElement hamburgerButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView\n")
    public static WebElement search;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText\n")
    public static WebElement SendKeysSearch;

    //getters
    public static WebElement getHamburgerButton() { return hamburgerButton; }
    public static WebElement getSearch() { return search; }
    public static WebElement getSendKeysSearch() { return SendKeysSearch; }




    public void searchElementFromDB(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getHamburgerButton().click();
        getSearch().click();
    }

}
