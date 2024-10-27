package utils;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.offset.PointOption.point;

public class BaseTest {

	public static AppiumDriver<MobileElement> driver;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Log out\"]")
	private MobileElement logout;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Yes\"]")
	private MobileElement yes;
	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[810,2088][1080,2161]']")
	private MobileElement profile;

	public void getAppiumServer() {

		DesiredCapabilities cap = new DesiredCapabilities();
		URL url;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		cap.setCapability("appium:platformName", MobilePlatform.ANDROID);
		cap.setCapability("appium:aplatformVersion", "12");
		cap.setCapability("appium:deviceName", "realme 7");
		cap.setCapability("appium:udid", "CMX8GAXSOBEUSS5T");
		cap.setCapability("appium:appPackage", "com.weloveliving.weloveliving");
		cap.setCapability("appium:appActivity", "com.weloveliving.we_love_living.MainActivity");
		cap.setCapability("appium:ignorHiddenApiPolicyError", "true");
		driver = new AndroidDriver<MobileElement>(url, cap);
	}

	public void logout() {

		click(profile, 5);
		scrollBottom();
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
			Thread.sleep(1000);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		ele.click();
	}

	public void click(MobileElement ele, int time) {
		waitForVisibility(ele);
		try {
			Thread.sleep(time * 1000);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		ele.click();
	}

	public void set_text(MobileElement ele, String text) {
		waitForVisibility(ele);
		ele.sendKeys(text);
	}

	public String get_text(MobileElement element) {
		waitForVisibility(element);
		String text = element.getAttribute("content-desc");
		return text;
	}

	public void scrollBottom() {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10);"));
	}

	public void swipeLeftToRight(MobileElement element) {

		int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
		int startY = element.getLocation().getY();
		int endY = startY - 200;

		(new TouchAction(driver)).press(point(startX, startY)).moveTo(point(startX, endY)).release().perform();
	}
}
