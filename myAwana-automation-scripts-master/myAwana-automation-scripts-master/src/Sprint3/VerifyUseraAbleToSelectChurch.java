package Sprint3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyUseraAbleToSelectChurch extends BaseTest {
	// 490,492 & 491
	@Test
	public void selectchurchFromChurchTab() throws Throwable {
		Thread.sleep(2000);
		Boolean myAccountTab = driver.findElement(By.xpath("//*[text()='My Account']")).isDisplayed();
		Assert.assertTrue(myAccountTab);
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//ul[@class='row list'][1]")).click();
		Boolean churchIcon = driver.findElement(By.xpath("//h3[@class='heading']/span")).isDisplayed();
		Assert.assertTrue(churchIcon);
		Boolean churchPic = driver.findElement(By.xpath("//img[@src='assets/img/church-profile-img.png']"))
				.isDisplayed();
		Assert.assertTrue(churchPic);
		driver.findElement(By.xpath("//span[@class='plus icon-add']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/order/history']")).isDisplayed());
		driver.findElement(By.xpath("//span[@class='plus icon-add']")).click();
		Thread.sleep(1000);
		try {
		Assert.assertFalse(driver.findElement(By.xpath("//a[@href='/order/history']")).isDisplayed());
		}catch(NoSuchElementException e) {
		
		}
		
	}
}
