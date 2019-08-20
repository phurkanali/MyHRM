package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyForgotPassIsClickable extends BaseTest {
	@Test
	// MyAw-149
	public void verifyForgotPasswordClickable() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		String tagName = driver.findElement(By.xpath("//*[text()='Forgot Password?']")).getTagName();
		Assert.assertEquals(tagName, "a");
	}

}
