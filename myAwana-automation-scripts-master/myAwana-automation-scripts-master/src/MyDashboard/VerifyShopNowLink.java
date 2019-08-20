package MyDashboard;

import com.myaw.pages.DashboardPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyShopNowLink extends BaseTest{
	
	@Test
	public void verifyShopNowLink() throws Exception
	{
		DashboardPage dashboardPage = new DashboardPage(driver);
		Thread.sleep(5000);
		
		
		
		
		boolean shopNowLink = dashboardPage.isDisplayedShopMoreButton();
		Assert.assertTrue(shopNowLink);
		
		
	/*	
		if(driver.getPageSource().contains("You don�t have any Orders to display")){
			log.info("Pass: Order are present");
			}else{
			log.error("Fail: You don�t have any Orders to display ");
			Assert.fail("");
		}
	*/
	/*	System.out.println("My Account displayed "+driver.findElement(By.xpath("//*[@*='pointer active']")).isDisplayed());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("(//*[@*='/dashboard'])[2]")).isDisplayed());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("//*[@*='heading']")).getText());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("//*[@*='para-txt']")).getText());
	*/	
		
		
		
		dashboardPage.logOut();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
