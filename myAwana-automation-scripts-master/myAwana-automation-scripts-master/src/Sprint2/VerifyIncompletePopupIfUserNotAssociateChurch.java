package Sprint2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyIncompletePopupIfUserNotAssociateChurch extends BaseTest {
	@Test
	public void verifyIncompletePopupIfUserNotAssociateChurch() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/profile/addChurch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("searchDetail")).sendKeys("Chu");
		driver.findElement(By.xpath("(//ul[@class='row'])[1]")).click();
		driver.findElement(By.className("c-btn")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='c-btn'])[2]")).click();
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//h4[@class='card-head']")).getText(), "Calvary Baptist Church");
		driver.findElement(By.xpath("//a[@href='/dashboard']")).click();
		String verifyMessage = driver.findElement(By.xpath("//span[@class='para-txt']")).getText();
		Assert.assertEquals(verifyMessage,
				"Please complete your profile by adding your details");
		Assert.assertTrue(driver.findElement(By.xpath("(//button)[1]")).isDisplayed(),
				"Complete Profile Button verify");
		Assert.assertTrue(driver.findElement(By.xpath("(//button)[2]")).isDisplayed(), "Not Now Button verify");
		driver.findElement(By.xpath("//a[@href='/profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon-trash-o icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-med btn-green margin-r10']")).click();
		Thread.sleep(5000);
	}

}
