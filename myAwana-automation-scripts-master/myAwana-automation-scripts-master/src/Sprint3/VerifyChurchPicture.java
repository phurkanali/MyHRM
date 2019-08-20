package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyChurchPicture extends BaseTest {
	// 490 & 491
	@Test
	public void selectchurchFromChurchTab() throws Throwable {
		Thread.sleep(5000);
		Boolean myAccountTab = driver.findElement(By.xpath("//a[text()='My Account']")).isDisplayed();
		Assert.assertTrue(myAccountTab);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//ul[@class='row list'][1]")).click();
		Boolean churchIcon = driver.findElement(By.xpath("//h3[@class='heading']/span")).isDisplayed();
		Assert.assertTrue(churchIcon);
		Boolean churchPic = driver.findElement(By.xpath("//img[@src='assets/img/church-profile-img.png']"))
				.isDisplayed();
		Assert.assertTrue(churchPic);
		driver.findElement(By.xpath("//a[@href='/order']")).click();
		Boolean orderHistory = driver.findElement(By.xpath("//a[@href='/order/history']")).isDisplayed();
		Assert.assertTrue(orderHistory);
		driver.findElement(By.xpath("//span[@class='minus icon-minus']")).click();
		String messnoOrder = driver.findElement(By.className("para-txt")).getText();
		Assert.assertEquals(messnoOrder, "You don’t have any Orders to display");
	}
}
