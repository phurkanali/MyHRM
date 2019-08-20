package SocialMediaLoginRegister;

import com.myaw.pages.DashboardPage;
import com.myaw.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class NewUserFlow extends BaseTest{

	@Test
	//
	public void verifyNewUserEndToEndFlow() throws Throwable {
		DashboardPage dashboardPage = new DashboardPage(driver);
		LoginPage loginPage = new LoginPage(driver);
	Thread.sleep(5000);
	dashboardPage.logOut();
	Thread.sleep(2000);
	loginPage.login("automationnewuat@mailinator.com","Test@123");
	Thread.sleep(3000);
	Boolean textCompleteProfile = driver.findElement(By.className("para-txt")).isDisplayed();
	Assert.assertTrue(textCompleteProfile);
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='para-txt']")).getText(), "You don�t have any Orders to display");
	driver.findElement(By.xpath("//a[@href='/order']")).click();
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='para-txt']")).getText(), "You don�t have any Orders to display");
	driver.findElement(By.xpath("//a[@href='/profile']")).click();
	Thread.sleep(3000);
	String billingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[1]")).getText();
	Assert.assertTrue(billingAddress.contains("No Billing Address Found"));
	String shippingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[2]")).getText();
	Assert.assertTrue(shippingAddress.contains("No Shipping Address Found"));
	}
}
