package Sprint7;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class RolesPermission extends BaseTest {

	@Test
	public void verifyRolesPermission() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class= 'active-select']")).click();
		driver.findElement(By.xpath("(//ul[@class= 'row list'])[1]")).click();
		String roles = driver.findElement(By.className("list")).getText();
		roles = roles.replaceAll("\\s+", "");
		Assert.assertEquals(roles, "DASHBOARDORDERSPROFILE&SETTINGSMANAGECHURCH");
		driver.findElement(By.xpath("//a[@href='/church']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//a[@href='/church/profile/modify']")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/manage-church']")).click();
		driver.findElement(By.xpath("//a[@href='/manage-church/programs']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//button")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/manage-church/leaders']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//a[@href='/manage-church/leaders/add']")).isDisplayed());

		//
		driver.findElement(By.xpath("//span[@class= 'active-select']")).click();
		driver.findElement(By.xpath("(//ul[@class= 'row list'])[2]")).click();
		roles = driver.findElement(By.className("list")).getText();
		roles = roles.replaceAll("\\s+", "");
		Assert.assertEquals(roles, "DASHBOARDORDERSPROFILE&SETTINGSMANAGECHURCH");
		driver.findElement(By.xpath("//a[@href='/church']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//a[@href='/church/profile/modify']")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/manage-church']")).click();
		driver.findElement(By.xpath("//a[@href='/manage-church/programs']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//button")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='/manage-church/leaders']")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//a[@href='/manage-church/leaders/add']")).isDisplayed());

	}

}
