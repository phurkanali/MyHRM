package Sprint2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyIncompleteAddresspopup extends BaseTest {
	@Test
	public void verifyIncompleteAddresspopup() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Thread.sleep(5000);

		String verifyMessage = driver.findElement(By.xpath("//span[@class='para-txt']")).getText();
		Assert.assertEquals(verifyMessage, "Please complete your profile by adding your details and adding a church association.");
		Assert.assertTrue(driver.findElement(By.xpath("(//button)[1]")).isDisplayed(), "Complete Profile Button verify");
		Assert.assertTrue(driver.findElement(By.xpath("(//button)[2]")).isDisplayed(), "Not Now Button verify");
	}

}
