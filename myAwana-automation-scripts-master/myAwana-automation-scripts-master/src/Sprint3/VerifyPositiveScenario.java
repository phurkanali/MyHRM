package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyPositiveScenario extends BaseTest {
	@Test
	// MyAw-151
	public void verifyPositiveScenario() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[text()='Forgot Password?']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("phurkan.ali@mailinator.com");
		driver.findElement(By.xpath("//div[@class='clearfix margin-b20']/button")).click();
		Boolean thanksMess = driver.findElement(By.className("thanks-msg")).isDisplayed();
		Assert.assertTrue(thanksMess);
	}
}
