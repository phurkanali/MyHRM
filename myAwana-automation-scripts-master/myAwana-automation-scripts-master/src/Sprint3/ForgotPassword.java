package Sprint3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class ForgotPassword extends BaseTest {
	@Test
	// MyAw-150 & 157.
	public void verifyForgotPage() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[text()='Forgot Password?']")).click();
		String window = driver.getTitle();
		Assert.assertEquals(window, "Forgot Password");
		Boolean isEnabled = driver.findElement(By.xpath("//input[@name='email']")).isEnabled();
		Assert.assertTrue(isEnabled);
		Boolean button = driver.findElement(By.xpath("//div[@class='clearfix margin-b20']/button")).isDisplayed();
		Assert.assertTrue(button);
		String signIn = driver.findElement(By.xpath("//*[text()='Sign in']")).getTagName();
		Assert.assertEquals(signIn, "a");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);
		String errorMess = driver.findElement(By.xpath("//span[@class='field-error-txt']")).getText();
		Assert.assertEquals(errorMess, "Please enter your email.");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("phurkanali");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);
		errorMess = driver.findElement(By.xpath("//span[@class='field-error-txt']")).getText();
		Assert.assertEquals(errorMess, "Please enter a valid email.");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);
		errorMess = driver.findElement(By.xpath("//span[@class='field-error-txt']")).getText();
		Assert.assertEquals(errorMess, "Please enter a valid email.");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);
		errorMess = driver.findElement(By.xpath("//span[@class='field-error-txt']")).getText();
		Assert.assertEquals(errorMess, "Please enter a valid email.");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("phurkan.ali@gmail.com");
		driver.findElement(By.xpath("//div[@class='clearfix margin-b20']/button")).click();
		errorMess = driver.findElement(By.xpath("//span[@class='error-text']")).getText();
		Assert.assertEquals(errorMess, "Email Id does not exists.");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@class='clearfix
		// margin-b20']/button")).sendKeys(Keys.TAB);

	}
}
