package Sprint7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyMyProfileDetails extends BaseTest {
	
	@Test
	public void verifyMyProfiledetails() throws Exception
	{
		driver.findElement(By.xpath("//*[@class='active-select']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='head text-green pointer'][1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='/order']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='/church']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@*='/church/profile/modify']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.name("//*[@*='accountID']")).getText());
		
		Select oSelect = new Select(driver.findElement(By.name("size")));
		oSelect.selectByIndex(2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='/manage-church']")).click();
		
		Thread.sleep(6000);
			
		
	}
	

}
