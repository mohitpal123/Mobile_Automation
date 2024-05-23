package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BaseTest;

public class ProfilePage extends BaseTest {

    public ProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//password
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Profile\n" + "Tab 3 of 3\"]")
    private MobileElement Profile;
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Password\"]")
    private MobileElement pasword;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]")
    private MobileElement CurrentPassword;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]")
    private MobileElement  NewPassword;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Password do not meet requirements:\n" +
            "\n" +
            "• Must contain at least 8 characters\n" +
            "• Must contain one special symbol (#, &, % etc)\n" +
            "• Must contain one number (0-9)\"]")
    private MobileElement Passworddonotmeetrequirements;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Passwords do not match\"]")
    private MobileElement ReTypeNewPasswordError;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[3]")
    private MobileElement ReTypeNewPassword;
    @AndroidFindBy( xpath ="//android.widget.Button[@content-desc=\"Save Changes\"]")
    private MobileElement SaveChanges;


// Biometric Settings
    @AndroidFindBy( xpath ="//android.widget.ScrollView/android.view.View[5]")
    private MobileElement enable;
    @AndroidFindBy( xpath ="//android.widget.ScrollView/android.view.View[5]")
    private MobileElement disable;


// Language
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Language\"]")
    private MobileElement Language;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Hindi\"]/android.widget.ImageView[2]")
    private MobileElement Hindi;
    @AndroidFindBy( xpath ="//android.widget.Button[@content-desc=\"Save Changes\"]")
    private MobileElement SaveChange;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"मेरा खाता\"]")
    private MobileElement मेराखाता;
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"भाषा\"]")
    private MobileElement भाषा;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"English\"]/android.widget.ImageView[2]")
    private MobileElement English;
    @AndroidFindBy( xpath ="//android.widget.Button[@content-desc=\"परिवर्तन सहेजें\"]")
    private MobileElement परिवर्तनसहेजें ;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"मेरा खाता\"]")
    private MobileElement changelanguage;


// JobHistory
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Job History\"]")
    private MobileElement JobHistory;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]")
    private MobileElement JobHistoryfillter;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Select Job Status\"]")
    private MobileElement SelectJobStatus;
    @AndroidFindBy( xpath ="//android.widget.CheckBox[@content-desc=\"Completed\"]")
    private MobileElement Completed;
    @AndroidFindBy( xpath ="//android.widget.Button[@content-desc=\"OK\"]")
    private MobileElement ok;
    @AndroidFindBy( xpath ="//android.widget.ImageView[@content-desc=\"Yesterday\n" + "Tuesday, May 21\"]")
    private MobileElement Yesterday;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Save\"]")
    private MobileElement Save;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[1]")
    private MobileElement LeftClick;


//EditProfile
    @AndroidFindBy( xpath ="//android.widget.ScrollView/android.widget.ImageView[1]")
    private MobileElement Edit;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Edit Profile Picture\"]")
    private MobileElement EditProfilePicture;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ImageView[1]")
    private MobileElement clear;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
    private MobileElement FirstName;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
    private MobileElement LastName;
    @AndroidFindBy( xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]")
    private MobileElement Phone;
    @AndroidFindBy( xpath ="//android.widget.Button[@content-desc=\"Save Changes\"]")
    private MobileElement Changes;
    @AndroidFindBy( xpath ="//android.view.View[@content-desc=\"Continue\"]")
    private MobileElement Continue;




    public void editProfileInformation(){
        click(Profile);
        click(Edit);
        click(EditProfilePicture);
        click(clear);
        click(FirstName);
        FirstName.clear();
        set_text(FirstName, "Saini");
        click(LastName);
        LastName.clear();
        set_text(LastName,"Abhi");
        click(Phone);
        Phone.clear();
        set_text(Phone,"123456789");
        click(Changes);
        click(Continue);
    }

    public void jobHistory() {
        click(Profile);
        click(JobHistory);
        click(JobHistoryfillter);
        click(SelectJobStatus);
        click(Completed);
        click(ok);
        click(Yesterday);
        click(Save);
        click(LeftClick);
    }

    public void biometricSetting(){
        click(enable);
        click(disable);
    }

    public void changPassword(){
        click(Profile);
        click(pasword);
        click(CurrentPassword);
        set_text(CurrentPassword,"SAINI1@123");
        click(NewPassword);
        set_text(NewPassword,"12345678");
        String PasswordError = get_text(Passworddonotmeetrequirements);
        Assert.assertEquals(PasswordError,"Password do not meet requirements:\n" +
                "\n" +
                "• Must contain at least 8 characters\n" +
                "• Must contain one special symbol (#, &, % etc)\n" +
                "• Must contain one number (0-9)");
        NewPassword.clear();
        set_text(NewPassword,"SAINI@123");
        set_text(ReTypeNewPassword,"12345678");
        String passwordError = get_text(ReTypeNewPasswordError);
        Assert.assertEquals(passwordError,"Passwords do not match");
        ReTypeNewPassword.clear();
        click(ReTypeNewPassword);
        set_text(ReTypeNewPassword,"SAINI@123");
        click(SaveChanges);
    }

    public void changeLanguage() {
        click(Language);
        click(Hindi);
        click(SaveChange);
        String languagetext = get_text(changelanguage);
        Assert.assertEquals(languagetext,"मेरा खाता");
        click(भाषा);
        click(English);
        click(परिवर्तनसहेजें);
    }

}