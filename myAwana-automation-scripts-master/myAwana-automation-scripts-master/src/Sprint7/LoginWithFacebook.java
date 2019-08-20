package Sprint7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class LoginWithFacebook extends BaseTest {
	@Test
	public void loginWithFacebook() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn.fb-btn-blue")).click();
		Thread.sleep(3000);
		String awanaWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String gmailWindow = i1.next();
			if (!awanaWindow.equalsIgnoreCase(gmailWindow)) {
				driver.switchTo().window(gmailWindow);
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("prabit120@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Test@123");
				driver.findElement(By.name("login")).click();
			}
		}
		driver.switchTo().window(awanaWindow);
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".heading.ellepse")).getText(), "Peter Rabit");
	}
}