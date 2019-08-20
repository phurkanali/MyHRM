package Sprint7;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;


public class NewUserEndToEndFlow extends BaseTest {
	@Test
	//
	public void verifyNewUserEndToEndFlow() throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.className("img-profile")).click();
	driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
	driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("automationnewuat@mailinator.com");
	driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("Test@123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(3000);
	Boolean textCompleteProfile = driver.findElement(By.className("para-txt")).isDisplayed();
	Assert.assertTrue(textCompleteProfile);
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='para-txt']")).getText(), "You don’t have any Orders to display");
	driver.findElement(By.xpath("//a[@href='/order']")).click();
	Thread.sleep(3000);
	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='para-txt']")).getText(), "You don’t have any Orders to display");
	driver.findElement(By.xpath("//a[@href='/profile']")).click();
	Thread.sleep(3000);
	String billingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[1]")).getText();
	Assert.assertTrue(billingAddress.contains("No Billing Address Found"));
	String shippingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[2]")).getText();
	Assert.assertTrue(shippingAddress.contains("No Shipping Address Found"));
	}
}
