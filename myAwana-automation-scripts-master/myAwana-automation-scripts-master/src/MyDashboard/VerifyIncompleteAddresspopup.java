package MyDashboard;

import com.myaw.pages.DashboardPage;
import com.myaw.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyIncompleteAddresspopup extends BaseTest{
	
	@Test
	public void verifyIncompleteAddresspopup() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage(driver);
		LoginPage loginPage = new LoginPage(driver);
	Thread.sleep(5000);
	dashboardPage.logOut();
	Thread.sleep(1000);
	loginPage.login("automationnewuat@mailinator.com","Test@123");
	Thread.sleep(8000);
	String verifyMessage = dashboardPage.getMessageIncompleteProfile();
	Assert.assertEquals(verifyMessage, "Please complete your profile by adding your details and adding a church association.");
	Assert.assertTrue(dashboardPage.isDisplayedCompleteProfileButton(), "Complete Profile Button verify");
	Assert.assertTrue(dashboardPage.isDisplayedNotNowButton(), "Not Now Button verify");
	}

}
