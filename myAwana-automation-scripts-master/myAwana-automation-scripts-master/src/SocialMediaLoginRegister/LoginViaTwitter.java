package SocialMediaLoginRegister;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class LoginViaTwitter extends BaseTest{

	@Test
	public void loginWithTwitter() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.cssSelector(".btn.twitter-btn-blue")).click();
		Thread.sleep(3000);
		String awanaWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String gmailWindow = i1.next();
			if (!awanaWindow.equalsIgnoreCase(gmailWindow)) {
				driver.switchTo().window(gmailWindow);
				driver.findElement(By.id("username_or_email")).clear();
				driver.findElement(By.id("username_or_email")).sendKeys("bookj7530@gmail.com");
				driver.findElement(By.id("password")).sendKeys("Test@123");
				driver.findElement(By.id("allow")).click();
			}
		}
		driver.switchTo().window(awanaWindow);
		Thread.sleep(10000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".heading.ellepse")).getText(), "Jungle Book");
	}
}
