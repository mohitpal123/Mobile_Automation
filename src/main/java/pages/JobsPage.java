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

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Jobs\n" + "Tab 2 of 3\"]")
    private MobileElement Jobs;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Discover Jobs\n" + "Tab 2 of 2\"]")
    private MobileElement discoverJobs;
//    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"1 Jobs found\"]/android.widget.ImageView[2]")
//    private MobileElement jobsFilter;
//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Select country: \"]")
//    private MobileElement selectCountry;
//    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"India\"]")
//    private MobileElement India;
//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Select State\"]")
//    private MobileElement selectState;
//    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Maharashtra\"]")
//    private MobileElement Maharashtra;
//    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Today\n" + "Thursday, May 23\"]")
//    private MobileElement Today;
//    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Save\"]")
//    private MobileElement Save;
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
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement Steps3;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Upload Photo\"])[1]")
    private MobileElement UploadPhoto1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Take a photo\"]")
    private MobileElement TakeaPhoto1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    private MobileElement Shutter1;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    private MobileElement Done;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    private MobileElement Submit;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"0%\"])[1]")
    private MobileElement Selector;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private MobileElement Continue1;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"50%\"]")
    private MobileElement AbstractPainting;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"0%\"])[1]")
    private MobileElement TV;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement Books;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"0%\"])[1]")
    private MobileElement BirdSculpture;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement Chair;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"0%\"])[2]")
    private MobileElement Fan;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
    private MobileElement Confirm;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next Room: Child Bedroom\"]")
    private MobileElement NextRoomChildBedroom;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement ChildBedroomSteps1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement ChildBedroomSteps2;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement ChildBedroomSteps3;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Upload Photo\"])[1]")
    private MobileElement ChildBedroomPhotoUpload;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Take a photo\"]")
    private MobileElement ChildBedroomTakeaPhoto;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    private MobileElement ChildBedroomPhoto1;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    private MobileElement ChildBedroomPhotoDone;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    private MobileElement ChildBedroomPhotoSubmit;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"40%\"]")
    private MobileElement ChildBedroomInventory1;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"20%\"]")
    private MobileElement ChildBedroomInventory2;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private MobileElement ChildBedroomInventoryContinue;

    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"100%\"])[1]")
    private MobileElement ChildBedroomInventoryAbstract;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"50%\"]")
    private MobileElement ChildBedroomInventoryTV;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"100%\"])[2]")
    private MobileElement ChildBedroomInventoryBooks;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"0%\"]")
    private MobileElement ChildBedroomInventoryBirdSculpture;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[1]")
    private MobileElement ChildBedroomInventoryChair;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement ChildBedroomInventoryFan;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
    private MobileElement ChildBedroomInventoryConfirm;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next Room: Living Room\"]")
    private MobileElement NextRoomLivingRoom;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement LivingRoomStep1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement LivingRoomStep2;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement LivingRoomStep3;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Upload Photo\"])[1]")
    private MobileElement LivingRoomUploadPhoto;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Take a photo\"]")
    private MobileElement LivingRoomTakeaPhoto;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    private MobileElement LivingRoomPhoto1;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    private MobileElement LivingRoomPhotoDone;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    private MobileElement LivingRoomPhotoSumbit;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"60%\"]")
    private MobileElement LivingRoomAbstractPainting1;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"20%\"]")
    private MobileElement LivingRoomAbstractPainting2;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private MobileElement LivingRoomAbstractPaintingContinue;

    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[1]")
    private MobileElement LivingRoomChecklist;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"100%\"]")
    private MobileElement LivingRoomChecklistTV;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement LivingRoomChecklistBooks;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"0%\"]")
    private MobileElement LivingRoomChecklistBirdSculpture;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement LivingRoomChecklistChair;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"100%\"]")
    private MobileElement LivingRoomChecklistFan;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
    private MobileElement LivingRoomChecklistConfirm;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Next Room: Kitchen\"]")
    private MobileElement NextRoomKitchen;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement KitchenStep1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement KitchenStep2;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Complete\"]")
    private MobileElement KitchenStep3;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Upload Photo\"])[1]")
    private MobileElement KitchenUploadPhoto1;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Take a photo\"]")
    private MobileElement KitchenTakeaPhoto;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    private MobileElement Kitchenclick;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    private MobileElement KitchencPhotodone;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    private MobileElement KitchencPhotoSubmit;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"60%\"]")
    private MobileElement KitchencInventryCheck1;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"40%\"]")
    private MobileElement KitchencInventryCheck2;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    private MobileElement KitchencInventryContinue;

    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[1]")
    private MobileElement KitchencInventryAbstractPainting;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"100%\"]")
    private MobileElement KitchencInventryTV;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement KitchencInventryBooks;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"0%\"]")
    private MobileElement KitchencInventryBirdSculpture;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"100%\"]")
    private MobileElement KitchencInventryChair;
    @AndroidFindBy(xpath = "(//android.widget.SeekBar[@content-desc=\"50%\"])[2]")
    private MobileElement KitchencInventryFan;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
    private MobileElement KitchencInventryConfirm;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Last Task: Cleaning Supplies Inventory\"]")
    private MobileElement LastTaskCleaningSuppliesInventory;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"40%\"]")
    private MobileElement CleaningSuppliesAbstractPainting;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"80%\"]")
    private MobileElement CleaningSuppliesTV;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"20%\"]")
    private MobileElement CleaningSuppliesBooks;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"40%\"]")
    private MobileElement CleaningSuppliesBirdSculpture;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"60%\"]")
    private MobileElement CleaningSuppliesChair;
    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"40%\"]")
    private MobileElement CleaningSuppliesFan;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
    private MobileElement CleaningSuppliesConform;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Check Out\"]")
    private MobileElement CheckOut;
























    public void acceptJobs() {
        click(Jobs);
        click(discoverJobs);
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
//        click(ViewToDo);
        click(StartNow);
        click(ClickForComplete);
        click(Steps1);
        click(Steps2);
        click(Steps3);
        click(UploadPhoto1);
        click(TakeaPhoto1);
        click(Shutter1);
        click(Done);
        click(Submit);
        click(Selector);
        click(AbstractPainting);
        click(Books);
        click(Confirm);
        click(NextRoomChildBedroom);
        click(ChildBedroomSteps1);
        click(ChildBedroomSteps2);
        click(ChildBedroomSteps3);
        click(ChildBedroomPhoto1);
        click(ChildBedroomTakeaPhoto);
        click(ChildBedroomPhoto1);
        click(ChildBedroomPhotoDone);
        click(ChildBedroomPhotoSubmit);
        click(ChildBedroomInventory1);
        click(ChildBedroomInventory2);
        click(ChildBedroomInventoryContinue);
        click(ChildBedroomInventoryAbstract);
        click(ChildBedroomInventoryTV);
        click(ChildBedroomInventoryBooks);
        click(ChildBedroomInventoryBirdSculpture);
        click(ChildBedroomInventoryChair);
        click(ChildBedroomInventoryFan);
        click(ChildBedroomInventoryConfirm);
        click(NextRoomLivingRoom);
        click(LivingRoomStep1);
        click(LivingRoomStep2);
        click(LivingRoomStep3);
        click(LivingRoomUploadPhoto);
        click(LivingRoomTakeaPhoto);
        click(LivingRoomPhoto1);
        click(LivingRoomPhotoDone);
        click(LivingRoomPhotoSumbit);
        click( LivingRoomAbstractPainting1);
        click(LivingRoomAbstractPainting2);
        click(LivingRoomAbstractPaintingContinue);
        click(NextRoomKitchen);
        click(KitchenStep1);
        click(KitchenStep2);
        click(KitchenStep3);
        click(KitchenUploadPhoto1);
        click(KitchenTakeaPhoto);
        click(Kitchenclick);
        click(KitchencPhotodone);
        click(KitchencPhotoSubmit);
        click(KitchencInventryCheck1);
        click(KitchencInventryCheck2);
        click(KitchencInventryContinue);
        click(KitchencInventryAbstractPainting);
        click(KitchencInventryTV);
        click(KitchencInventryBooks);
        click(KitchencInventryBirdSculpture);
        click(KitchencInventryChair);
        click(KitchencInventryFan);
        click(KitchencInventryConfirm);
        click(LastTaskCleaningSuppliesInventory);
        click(CleaningSuppliesAbstractPainting);
        click(CleaningSuppliesTV);
        click(CleaningSuppliesBooks);
        click(CleaningSuppliesBirdSculpture);
        click(CleaningSuppliesChair);
        click(CleaningSuppliesFan);
        click(CleaningSuppliesConform);
        click(CheckOut);



    }
}
