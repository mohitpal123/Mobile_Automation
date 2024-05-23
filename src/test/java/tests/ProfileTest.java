package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;
import utils.BaseTest;

public class ProfileTest extends BaseTest{

    ProfilePage profilePage;
    LoginPage loginPage;

    @BeforeClass
    public void launchApp (){
        getAppiumServer();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        loginPage.enterValidDetails();
    }

    @Test (priority=1)
    public void verifyEditProfileInformation(){
        profilePage.editProfileInformation();
    }

    @Test(priority = 2)
    public void verifyJobHistory(){
        profilePage.jobHistory();
    }

    @Test(priority = 3)
    public void verifyBiometricSetting(){
        profilePage.biometricSetting();
    }

//    @Test(priority = 4)
//    public void passwordChang(){
//        profilePage.changPassword();
//    }

    @Test(priority = 5)
    public void verifyChangeLanguage(){
        profilePage.changeLanguage();
    }
}
