package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.JobsPage;
import pages.LoginPage;
import utils.BaseTest;

public class JobsTest extends BaseTest {


    JobsPage jobsPage;
    LoginPage loginPage;

    @BeforeClass
    public void launchApp (){
        getAppiumServer();
        loginPage = new LoginPage();
        jobsPage = new JobsPage();
        loginPage.enterValidDetails();
    }

      @Test (priority = 1)
      public void jobs(){
        jobsPage.acceptJobs();
      }

      @Test(priority=2)
      public void verifyMaindashboard(){
        jobsPage.mainDashboard();

    }
}
