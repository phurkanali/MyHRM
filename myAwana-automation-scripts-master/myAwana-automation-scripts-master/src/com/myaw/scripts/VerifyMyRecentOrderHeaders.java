package com.myaw.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyMyRecentOrderHeaders extends BaseTest{
	
	@Test
	public void myRecentOrdersHeaders()
	{
		
		String myRecentOrders = driver.findElement(By.xpath("(//*[@class='heading'])[2]")).getText();
		
		System.out.println(myRecentOrders);
		if(myRecentOrders.equals("My Recent Orders"))
		{
			System.out.println("Pass");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> borderlist = driver.findElements(By.xpath("//*[@*='row list border-no']/*"));
		
		System.out.println(borderlist.size());
		for(int j=0;j<borderlist.size();j++)
		{
			System.out.println(borderlist.get(j).getText());
		}
		
	}

}
