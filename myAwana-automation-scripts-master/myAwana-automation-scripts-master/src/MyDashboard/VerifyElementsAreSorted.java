package MyDashboard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

import junit.framework.Assert;

public class VerifyElementsAreSorted extends BaseTest {
	
	@Test
	public void verifyElementsAreSorted() throws Exception
	{
		Thread.sleep(5000);
				
		
		List<WebElement> listOfOrders = driver.findElements(By.xpath("//ul[@class='row list']"));
		Assert.assertEquals(5, listOfOrders.size());
		
		
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
