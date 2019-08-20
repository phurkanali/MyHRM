package Sprint3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class ChangePasswordErrorMessage extends BaseTest{
	
	@Test
	public void changePasswordErrorMessage() throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@*='/profile']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@*='/profile/changepassword']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("currentPassword")).sendKeys("Test@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@*='New Password']")).sendKeys("Test@123");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Test@123");
		
		//Assert.fail();
	}

}
