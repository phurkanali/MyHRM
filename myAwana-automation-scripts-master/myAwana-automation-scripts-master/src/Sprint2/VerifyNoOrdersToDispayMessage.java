package Sprint2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyNoOrdersToDispayMessage extends BaseTest {
	
	@Test
	public void verifyNoOrderToDispalyMessage() throws Exception
	{

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@*='Profile:Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("((//li)[10]//a)[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("test1@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(5000);
		String verifyMessage = driver.findElement(By.xpath("//*[@*='para-txt']")).getText();
		
		if (verifyMessage.trim().equals("You don?t have any Orders to display"))
		{
			//Reporter.log("Verified No Orders Message",true);
			System.out.println("Verified No Orders Message");
		}
		else
		{
			Assert.fail();
		}
		
		
	}

	@Test
	public void verifyNoOrderToDispalyMessage1() throws Exception {

		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Thread.sleep(5000);

		String verifyMessage = driver.findElement(By.xpath("//p[@class='para-txt']")).getText();
		Assert.assertEquals(verifyMessage, "You don?t have any Orders to display");
	}
}
