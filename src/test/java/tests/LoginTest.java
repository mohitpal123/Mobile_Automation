package tests;

import org.testng.annotations.*;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @BeforeClass
    public void launchApp (){
        getAppiumServer();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginWithInvalidDetails() {
        loginPage.enterInvalidDetails();
    }

    @Test(priority = 2)
    public void loginWithValidEmailInvalidPassword(){
        loginPage.enterValidEmailInvalidPassword();

    }

    @Test(priority = 3)
    public void loginWithValidDetails() {
        loginPage.enterValidDetails();

    }

    @AfterClass
    public void logout(){
       loginPage.logout();
        driver.quit();
    }
//    @AfterTest
//    public void Profile(){
//        loginPage.Profile();
//
//    }
}
