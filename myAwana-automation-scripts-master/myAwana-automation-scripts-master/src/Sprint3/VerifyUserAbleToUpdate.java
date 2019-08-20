package Sprint3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyUserAbleToUpdate extends BaseTest {
	// MYAW-501 & 504 & 500
	@Test
	public void userAbleToTest() throws Throwable {
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//ul[@class='row list'][1]")).click();
		driver.findElement(By.xpath("//a[@href='/church']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("ST Judes Church");
		driver.findElement(By.xpath("//input[@name='BillingStreet']")).sendKeys("1 main road");
		driver.findElement(By.xpath("//input[@name='Mailing City']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@name='BillingPostalCode']")).sendKeys("17551");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert-msg success']")).getText(),
				"Profile Updated Succesfully");
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@class='heading']")).getText(), "ST Judes Church");
		// Cleanup Test Data
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Rainbows End Youth Services");
		driver.findElement(By.xpath("//input[@name='BillingStreet']")).sendKeys("105 Fairview St");
		driver.findElement(By.xpath("//input[@name='Mailing City']")).sendKeys("Mount Joy");
		driver.findElement(By.xpath("//input[@name='BillingPostalCode']")).sendKeys("17552");
	}

}
