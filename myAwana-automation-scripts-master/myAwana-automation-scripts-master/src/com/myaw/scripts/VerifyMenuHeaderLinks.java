package com.myaw.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyMenuHeaderLinks extends BaseTest 
{
	@Test
	public void verifyMenuHeaderLinks()
	{
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@href='https://www.awana.org']")).click();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
		
	}
	
}
