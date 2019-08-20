package com.myaw.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class RecentOrderFiveByDefault extends BaseTest
{

	@Test
	public void recentOrderFiveByDefault()
	{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		List<WebElement> myRecentOrdersall = driver.findElements(By.xpath("//*[@*='order-id']"));
		
		System.out.println(myRecentOrdersall.size());
		
		if(myRecentOrdersall.size()>=5)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fails");
			Assert.fail();
		}
	}
}
