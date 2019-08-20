package Sprint2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.myaw.base.BaseTest;

public class VerifyProfileAutoPopulatesDetails extends BaseTest{
	
	@Test
	public void verifyProfileAutoPopulateDetails() throws Exception
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@*='/profile']")).click();
		
		Thread.sleep(4000);
	//	driver.findElement(By.name("FirstName")).clear();
		
		System.out.println("printinggg..."+driver.findElement(By.name("FirstName")).getAttribute("value"));
		
	/*	driver.findElement(By.name("LastName")).clear();
		driver.findElement(By.name("FirstName")).sendKeys("Man");
		
		driver.findElement(By.name("Phone")).clear();
		driver.findElement(By.name("Phone")).sendKeys("0000000000");
		
		
		driver.findElement(By.name("MailingStreet")).clear();
		driver.findElement(By.name("MailingStreet")).sendKeys("No Street");
		
		driver.findElement(By.name("Mailing City")).clear();
		driver.findElement(By.name("Mailing City")).sendKeys("Streetautomated");
		
		driver.findElement(By.name("MailingPostalCode")).clear();
		driver.findElement(By.name("MailingPostalCode")).sendKeys("12345");
		
	*/
	}
	
}
