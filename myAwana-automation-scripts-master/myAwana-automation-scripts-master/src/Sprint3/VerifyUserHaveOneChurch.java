package Sprint3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyUserHaveOneChurch extends BaseTest {
	// MYAW-474,472 & 471
	@Test
	public void verifUserHaveAChurch() {
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		List<WebElement> numberChurch = driver.findElements(By.xpath("//ul[@class='row list'][1]"));
		Assert.assertEquals(numberChurch.size(), 1);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("autotest@mailinator.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		try {
			driver.findElement(By.xpath("//span[text()='My Church']"));
		} catch (Exception e) {
			System.out.println("Element does not exist!");
		}
	}
}
