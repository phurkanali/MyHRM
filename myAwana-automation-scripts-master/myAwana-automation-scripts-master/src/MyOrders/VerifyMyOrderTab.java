package MyOrders;

import com.myaw.pages.DashboardPage;
import com.myaw.pages.LeftPaneNavigationPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyMyOrderTab extends BaseTest{
	
	@Test
	public void verifyMyOrderTab() throws Exception
	{
		LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);
		Thread.sleep(5000);
		
		
		
		
		boolean myOrderTab = driver.findElement(By.xpath("//a[@href='/order/history']")).isDisplayed();
		Assert.assertTrue(myOrderTab);
		leftPaneNavigationPage.clickOrderHistory();
		Thread.sleep(2000);
		
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
		
		
		
		driver.findElement(By.xpath("(//*[@*='icon-icon_arrow_down dropdown-arrow'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a)[13]")).click();
		Thread.sleep(3000);
		
		
		
		
		
	}

}
