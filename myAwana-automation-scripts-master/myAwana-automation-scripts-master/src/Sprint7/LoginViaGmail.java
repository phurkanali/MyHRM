package Sprint7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class LoginViaGmail extends BaseTest {
	@Test
	public void loginWithGmail() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.className("img-profile")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		driver.findElement(By.cssSelector(".btn.gplus-btn-red")).click();
		Thread.sleep(3000);
		String awanaWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {
			String gmailWindow = i1.next();
			if (!awanaWindow.equalsIgnoreCase(gmailWindow)) {
				driver.switchTo().window(gmailWindow);
				driver.findElement(By.id("identifierId")).clear();
				driver.findElement(By.id("identifierId")).sendKeys("casinor44@gmail.com");
				driver.findElement(By.id("identifierNext")).click();
				driver.findElement(By.name("password")).sendKeys("Test@123");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(10000);
				driver.close();
			}
		}
		driver.switchTo().window(awanaWindow);
	}
}
