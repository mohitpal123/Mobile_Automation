package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class JobsPage extends BaseTest {
    public JobsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
//Discoverjobs

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Jobs\n" + "Tab 2 of 3\"]")
    private MobileElement Jobs;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Discover Jobs\n" + "Tab 2 of 2\"]")
    private MobileElement discoverJobs;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"1 Jobs found\"]/android.widget.ImageView[2]")
    private MobileElement jobsFilter;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Select country: \"]")
    private MobileElement selectCountry;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"India\"]")
    private MobileElement India;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Select State\"]")
    private MobileElement selectState;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Maharashtra\"]")
    private MobileElement Maharashtra;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Today\n" + "Thursday, May 23\"]")
    private MobileElement Today;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Save\"]")
    private MobileElement Save;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Accept Job\"])[1]")
    private MobileElement acceptJob;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Continue to Dashboard\"]")
    private MobileElement continueToDashboard;

    /* **********     MainDashboard   ********** */

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"W\"])[1]")
    private MobileElement nextDay;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"You have 1 job Today\"]")
    private MobileElement jobToday;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"T\"])[1]")
    private MobileElement Thursday;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"F\"]")
    private MobileElement friday;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Today, May 23\"]")
    private MobileElement TodayMay23;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next Week\"]")
    private MobileElement NextWeek;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Monday, May 27\"]")
    private MobileElement MondayMay27;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Today\"]")
    private MobileElement day;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"John Paktolus\n" +
            "Plot No, T1, Near, 2087, Nehru Rd, Extn, Vile Parle East, Vile Parle  Mumbai Maharashtra\n" +
            "05:40 PM - 06:10 PM\n" +
            "House Cleaning\n" +
            "2 Bedrooms, 1 Kitchen, 1 Living Room\n" +
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean quis pellentesque libero, eget porta sem. Suspendisse in suscipit elit, quis semper justo.\"]")
    private MobileElement  HouseCleaning;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Check into Property\"]")
    private MobileElement CheckintoProperty;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Continue\"]")
    private MobileElement Continue;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Check into Property\"]")
    private MobileElement  Property;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"View To-Do\"]")
    private MobileElement  ViewToDo;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Start Now\"]")
    private MobileElement StartNow;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Instructions\n" +
            "Click for \n" +
            "Not Complete\n" +
            "Click for \n" +
            "Complete\"]/android.widget.ImageView[2]")
    private MobileElement ClickForComplete;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement Steps1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement Steps2;
//    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
//    private MobileElement Nextagain;
//    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
//    private MobileElement againNext;






    public void acceptJobs() {
        click(Jobs);
        click(discoverJobs);
//        click(jobsFilter);
//        click(selectCountry);
//        click(India);
//        click(selectState);
//        click(Maharashtra);
//        click(Today);
//        click(Save);
        click(acceptJob);
        click(continueToDashboard);
    }
    public void mainDashboard(){
//        click(nextDay);
//        String pageText = get_text(jobToday);
//        Assert.assertEquals(pageText,"You have 1 job Today");
//        click(Thursday);
//        click(friday);
//        click(TodayMay23);
//        click(NextWeek);
//        click(MondayMay27);
//        click(day);
        click(HouseCleaning);
        click(CheckintoProperty);
        click(Continue);
        click( Property);
        click(ViewToDo);
        click(StartNow);
        click(ClickForComplete);
        click(Steps1);
        click(Steps2);
//        click(Nextagain);
//        click(againNext);

    }
}
