package Sprint3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

import generics.Utility;

public class VerifySucessMessageInRegisterPage extends BaseTest {
	Utility utility = new Utility();

	// MYAW_477 & 476
	@Test(enabled = false)
	public void verifySuccessMessage() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.xpath("//*[@href='/register']")).click();
		driver.findElement(By.name("firstName")).sendKeys("phurkan");
		driver.findElement(By.name("lastName")).sendKeys("ali");
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String todayDate = dateFormat.format(date);
		driver.findElement(By.name("email")).sendKeys(todayDate + "@mailinator");
	//	utility.selectOptionInDropDown(driver.findElement(By.name("month")), "January");
		//utility.selectOptionInDropDown(driver.findElement(By.name("date")), "1");
	//	utility.selectOptionInDropDown(driver.findElement(By.name("year")), "2000");
		//utility.selectOptionInDropDown(driver.findElement(By.name("year")), "United States");
		driver.findElement(By.name("password")).sendKeys("Phur@1991");
		driver.findElement(By.name("reenterpassword")).sendKeys("Phur@1991");
		driver.findElement(By.className("input-slider round")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Boolean thankMess = driver.findElement(By.className("thanks-msg")).isDisplayed();
		Assert.assertTrue(thankMess);
	}
}
