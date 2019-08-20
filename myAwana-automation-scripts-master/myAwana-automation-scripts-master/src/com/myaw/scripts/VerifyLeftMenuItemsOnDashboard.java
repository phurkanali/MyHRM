package com.myaw.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardScreen;
import com.myaw.pages.LoginPage;

public class VerifyLeftMenuItemsOnDashboard extends BaseTest {

	@Test
	public void leftMenuItemsOnDashboard() throws Exception
	{
		driver.findElement(By.xpath("//*[@*='/order']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@*='/profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@*='/dashboard']")).click();
	}
	
	

}
