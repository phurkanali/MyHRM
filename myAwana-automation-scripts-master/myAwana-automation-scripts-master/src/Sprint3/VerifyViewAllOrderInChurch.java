package Sprint3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyViewAllOrderInChurch extends BaseTest {
	ArrayList<String> orderDateInString = new ArrayList<String>();
	ArrayList<String> sortedDate;

	// MYAW-493,495,496, 482,481 & 497
	@Test
	public void verifyViewAllOrders() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.name("email")).sendKeys("automationolduat@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='My Church']")).click();
		driver.findElement(By.xpath("//*[text()='Crossroads Bible Church']")).click();
		List<WebElement> listOfOrders = driver.findElements(By.xpath("//ul[@class='row list']"));
		Assert.assertEquals(5, listOfOrders.size());
		driver.findElement(By.xpath("//a[@href='/order/history']")).click();
		Thread.sleep(2000);
		String orderURL = driver.getCurrentUrl();
		Assert.assertEquals(orderURL, "http://dev1.my.awana.org/order/history");
		boolean pagination = driver.findElement(By.xpath("//li[@class='current']")).isDisplayed();
		Assert.assertTrue(pagination);
		List<WebElement> orderDate = driver.findElements(By.xpath("//li[@class='col-3 text-center']"));
		for (WebElement a : orderDate) {
			String date = a.getText();
			SimpleDateFormat formatter = new SimpleDateFormat("MMM. dd, yyyy");
			Date date1 = formatter.parse(date);
			orderDateInString.add(new SimpleDateFormat("yyyyMMdd").format(date1));
			System.out.println(new SimpleDateFormat("yyyyMMdd").format(date1));
			sortedDate = new ArrayList<String>(orderDateInString);
		}
		Collections.sort(sortedDate, Collections.reverseOrder());
		System.out.println(orderDateInString);
		System.out.println(sortedDate);
		Assert.assertEquals(orderDateInString, sortedDate);
	}
}
