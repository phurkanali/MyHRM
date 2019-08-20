package Sprint7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class AddChurch extends BaseTest {

	@Test
	//
	public void addChurch() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
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
		Assert.assertEquals(driver.findElement(By.xpath("//h4[@class='card-head']")).getText(), "BEETHAL CHURCH");
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationolduat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class= 'active-select']")).click();
		driver.findElement(By.xpath("//ul[@class= 'row list']")).click();
		driver.findElement(By.xpath("//a[@href='/manage-church']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/manage-church/leaders']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("automationnewuat@mailinator.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()= 'Approve']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".para-txt.elle")).getText(),
				"You have successfully approved Automation New's account");
		Thread.sleep(3000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class= 'active-select']")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='icon-trash-o icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-med btn-green margin-r10']")).click();
		Thread.sleep(5000);
	}
}
