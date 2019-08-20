package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyChurchHaveNoOrder extends BaseTest {
	// MYAW-494
	@Test
	public void verifyChurchHasNoOrder() {
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//ul[@class='row list'][1]")).click();
		String messnoOrder = driver.findElement(By.className("para-txt")).getText();
		Assert.assertEquals(messnoOrder, "You don’t have any Orders to display");
	}
}
