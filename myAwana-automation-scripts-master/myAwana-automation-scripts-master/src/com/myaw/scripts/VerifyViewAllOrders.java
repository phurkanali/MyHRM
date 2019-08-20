package com.myaw.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyViewAllOrders extends BaseTest {
	
	@Test
	public void viewAllOrdersItems()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@*=\"/order/history\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
