package com.myaw.scripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class MyAccountTab extends BaseTest {
	
	@Test
	public void verifyMyAccountTabOnDashboard()
	{
		driver.findElement(By.xpath("//*[@title='My Account']")).click();
		try {
			Thread.sleep(3000);
			Reporter.log("My Account Tab Enabled By Default",true);			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
				
	}

}
