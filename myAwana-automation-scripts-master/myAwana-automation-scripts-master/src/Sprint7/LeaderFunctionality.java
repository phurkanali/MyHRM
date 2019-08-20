package Sprint7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class LeaderFunctionality extends BaseTest {

	@Test
	//
	public void editProfile() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class= 'active-select']")).click();
		driver.findElement(By.xpath("//ul[@class= 'row list']")).click();
		driver.findElement(By.xpath("//a[@href='/manage-church']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/manage-church/leaders']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/manage-church/leaders/add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("automationsecond@mailinator.com");
		driver.findElement(By.name("email")).sendKeys(Keys.TAB);
		Thread.sleep(5000);
		driver.findElement(By.className("c-btn")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.className("para-txt")).getText(),
				"You have been invited to join a church in MyAwana!");
		Thread.sleep(6000);
		Assert.assertEquals(driver.getCurrentUrl(), "http://dev1.my.awana.org/manage-church/leaders");
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("automationsecond@mailinator.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()= 'Approve']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".para-txt.elle")).getText(),
				"You have successfully approved Automation Second's account");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("automationsecond@mailinator.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".icon.close-icon.icon-icon_plus_square")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-green.margin-r10.cptr")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("c-btn")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("automationsecond@mailinator.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".icon.close-icon.icon-icon_plus_square")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-red-bor.cptr")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".para-txt")).getText(),
				"You have successfully Removed Automation Second Account");
	}
}
