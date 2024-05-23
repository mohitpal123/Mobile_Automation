package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    public static AppiumDriver<MobileElement> driver;

    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Log out\"]")
    private MobileElement logout;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Yes\"]")
    private MobileElement yes;
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Profile\n" + "Tab 3 of 3\"]")
    private MobileElement profile;

    public void getAppiumServer()  {

        DesiredCapabilities cap = new DesiredCapabilities();
        URL url ;
        try{
        url = new URL("http://127.0.0.1:4723/wd/hub");}
        catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        cap.setCapability("appium:platformName", MobilePlatform.ANDROID);
        cap.setCapability("deviceName", "Pixel6");
        cap.setCapability("app", "C:\\wll-releases\\wll-release_21_05_24.apk");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("noReset", "false");
        cap.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver<MobileElement>(url, cap);
    }

    public void logout(){

        click(profile);
        click(logout);
        click(yes);

    }

    public static final long WAIT = 20;

    public void waitForVisibility(MobileElement e) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(MobileElement ele) {
        waitForVisibility(ele);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ele.click();
    }

    public void set_text(MobileElement ele, String text) {
        waitForVisibility(ele);
        ele.sendKeys(text);
    }

    public String get_text(MobileElement element)
    {
        waitForVisibility(element);
        String text = element.getAttribute("content-desc");
        return text;
    }
}


