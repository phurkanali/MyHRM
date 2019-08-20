package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyChurchdetails extends BaseTest {
	// MYAW-499
	@Test
	public void verifyChurchDetails() throws Throwable {
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//ul[@class='row list'][1]")).click();
		driver.findElement(By.xpath("//a[@href='/church']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "http://dev1.my.awana.org/church/profile");
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='Name']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='Phone']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='BillingStreet']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='Mailing City']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='BillingPostalCode']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='Name']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//select[@name='BillingState']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//select[@name='BillingCountry']")).isDisplayed());
	}

}
