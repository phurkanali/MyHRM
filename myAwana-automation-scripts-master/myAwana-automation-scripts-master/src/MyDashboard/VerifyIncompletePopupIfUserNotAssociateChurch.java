package MyDashboard;

import com.myaw.base.BaseTest;
import com.myaw.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyIncompletePopupIfUserNotAssociateChurch extends BaseTest {

    @Test
    public void verifyIncompletePopupIfUserNotAssociateChurch() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);
        AddYourChurchPage addYourChurchPage = new AddYourChurchPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        Thread.sleep(5000);
        dashboardPage.logOut();
        Thread.sleep(1000);
	    loginPage.login("automationnewuat@mailinator.com","Test@123");
        Thread.sleep(5000);
        leftPaneNavigationPage.clickAddChurchLink();
        Thread.sleep(1000);
        addYourChurchPage.setChurchNameInSearchBox("bethal");
        addYourChurchPage.selectFirstChurch();
        addYourChurchPage.selectAwanaRole("Commander");
        addYourChurchPage.selectChurchRole("Church Volunteer");
        addYourChurchPage.clickOnAddButton();
        Thread.sleep(5000);
        Assert.assertEquals(myProfilePage.getChurchNameChurchCard(), "Bethal Church");
        leftPaneNavigationPage.clickMyDashboard();
        Thread.sleep(1000);
        String verifyMessage = dashboardPage.getMessageIncompleteProfile();
        Assert.assertEquals(verifyMessage,
                "Please complete your profile by adding your details");
        Assert.assertTrue(dashboardPage.isDisplayedCompleteProfileButton(),
                "Complete Profile Button verify");
        Assert.assertTrue(dashboardPage.isDisplayedNotNowButton(), "Not Now Button verify");
    }
    @AfterMethod(alwaysRun = true)
        public void cleanup() throws Exception{
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        dashboardPage.logOut();
        loginPage.login("automationnewuat@mailinator.com", "Test@123");
        Thread.sleep(5000);
        dashboardPage.clickMyProfilelink();
        myProfilePage.deleteChurch("Bethal");
        driver.close();
        }
    }

