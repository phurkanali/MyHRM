package com.myaw.scripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyPaginationLinks extends BaseTest{
		
	@Test
	public void verifyPaginationLinks()  
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@*=\"/order/history\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//List<WebElement> allorders2 = driver.findElements(By.xpath("//*[@class='row list']/*"));
		
		
		
		String page = driver.findElement(By.xpath("//*[@*='ngx-pagination']/*")).getAttribute("class");
		
		System.out.println(page);
		
		if(page.equals("pagination-previous disabled"))
{
			Assert.fail();
}
	}
	
}
