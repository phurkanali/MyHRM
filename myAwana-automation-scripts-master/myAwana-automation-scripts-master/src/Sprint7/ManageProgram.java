package Sprint7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class ManageProgram extends BaseTest {

	@Test
	//
	public void editProfile() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class= 'active-select']")).click();
		driver.findElement(By.xpath("//ul[@class= 'row list']")).click();
		driver.findElement(By.xpath("//a[@href='/manage-church']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/manage-church/programs']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button")).click();
		ArrayList<String> listprogram = new ArrayList<String>();
		listprogram.add("Puggles");
		listprogram.add("Cubbies");
		listprogram.add("Sparks");
		listprogram.add("Truth and Training");
		listprogram.add("Trek");
		listprogram.add("Journey");
		listprogram.add("Truthseekers");
		listprogram.add("High Power Soccer");
		ArrayList<String> listprogram1 = new ArrayList<String>();
		List<WebElement> program = driver.findElements(By.xpath("//label[@class='total-items']"));
		for (WebElement e : program) {
			listprogram1.add(e.getText());
		}
		Assert.assertEquals(listprogram, listprogram1);
		Boolean dropdown = driver.findElement(By.name("meetingDay")).isEnabled();
		if (dropdown) {
			Select meetingDay = new Select(driver.findElement(By.name("meetingDay")));
			meetingDay.selectByValue("Monday");
			driver.findElement(By.name("noOfKids")).clear();
			driver.findElement(By.name("noOfKids")).sendKeys("10");
			driver.findElement(By.xpath("//button")).click();

		} else {
			driver.findElement(By.cssSelector(".input-slider.round")).click();
			Select meetingDay = new Select(driver.findElement(By.name("meetingDay")));
			meetingDay.selectByValue("Monday");
			driver.findElement(By.name("noOfKids")).clear();
			driver.findElement(By.name("noOfKids")).sendKeys("10");
			driver.findElement(By.xpath("//button")).click();
		}
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[1]")).getText(), "YES");
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[2]")).getText(), "Monday");
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[3]")).getText(), "10");

	}
}
