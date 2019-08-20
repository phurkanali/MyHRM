package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyRegisterLinkDisplayed extends BaseTest {
	// 475
	@Test
	public void verifyRegisterLinkDisplayed() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		Boolean isDisplayedRegister = driver.findElement(By.xpath("//a[@routerlink='/register']")).isDisplayed();
		Assert.assertTrue(isDisplayedRegister);
	}
}
