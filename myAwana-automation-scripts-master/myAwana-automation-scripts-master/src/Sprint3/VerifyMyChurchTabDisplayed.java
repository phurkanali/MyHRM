package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyMyChurchTabDisplayed extends BaseTest {
	// 489
	@Test
	public void myChurchIsDisplayed() throws Throwable {
		Thread.sleep(2000);
		Boolean myChurchTab = driver.findElement(By.xpath("//span[text()='My Church']")).isDisplayed();
		Assert.assertTrue(myChurchTab);
	}
}
