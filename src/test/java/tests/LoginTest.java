package tests;

import org.testng.annotations.*;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

	LoginPage loginPage;

	@BeforeClass
	public void launchApp() {
		getAppiumServer();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginvalidDetails() {
		loginPage.entervalidDetails();
	}

	@Test(priority = 2)

	@AfterClass
	public void logout() {
		loginPage.logout();
		driver.quit();
	}
}
