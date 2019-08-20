package com.myaw.scripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class ValidateProfileSuccessMessage extends BaseTest{
	
	@Test
	public void validateProfileSuccessMessage() throws Exception
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='/profile']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.name("FirstName")).clear();
		driver.findElement(By.name("FirstName")).sendKeys("Spider");
		
		driver.findElement(By.name("LastName")).clear();
		driver.findElement(By.name("FirstName")).sendKeys("Man");
		
		driver.findElement(By.name("Phone")).clear();
		driver.findElement(By.name("Phone")).sendKeys("0000000000");
		
		
		driver.findElement(By.name("MailingStreet")).clear();
		driver.findElement(By.name("MailingStreet")).sendKeys("No Street");
		
		driver.findElement(By.name("Mailing City")).clear();
		driver.findElement(By.name("Mailing City")).sendKeys("Streetautomated");
		
		driver.findElement(By.name("MailingPostalCode")).clear();
		driver.findElement(By.name("MailingPostalCode")).sendKeys("12345");
		
		driver.findElement(By.xpath("//*[@*='submit']")).click();
		
		Thread.sleep(5000);
		
		String vm = driver.findElement(By.xpath("//*[contains(text(),'Profile Updated Succesfully')]")).getText();

				if (vm.equals("Profile Updated Succesfully"))
				{
					System.out.println("Updated profile successfully...");
				}
				else
				{
					System.out.println("Update profile fails..");
					Assert.fail();
				}
	}

}
