package getText;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePageText extends MobileAPI {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[2]\n")
    public static WebElement britney;


    public static WebElement getBritney(){return britney;}

    public void textBritney(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        String text1= getBritney().getText();
        System.out.println(text1);
        Assert.assertEquals(text1,"Britney Spears checks into mental health facility amid dad’s illness");
    }
}
