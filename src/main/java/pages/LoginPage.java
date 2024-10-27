package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BaseTest;

public class LoginPage extends BaseTest {

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
	private MobileElement email;
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
	private MobileElement password;
	@AndroidFindBy(xpath = "//android.widget.CheckBox")
	private MobileElement rememberMe;
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Login']")
	private MobileElement login;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Let’s Get Started!\"]")
	private MobileElement LetGetStarted;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Login\"]")
	private MobileElement loginText;
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"The user does not exist.\"]")
	private MobileElement errorText;

	public void entervalidDetails() {
		String screen_title = get_text(loginText);
		System.out.printf(screen_title);
		Assert.assertEquals(screen_title, "Login");
		click(email);
		set_text(email, "abi65@gmail.com");
		click(password);
		set_text(password, "12345");
		driver.navigate().back();
		click(login);
		String pageError = get_text(errorText);
		Assert.assertEquals(pageError, "The user does not exist.");
	}

}
