package com.myaw.pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myaw.base.HomePage;

public class DetailsPage extends HomePage
{

	public DetailsPage(WebDriver driver) {
		super(driver);
		
	}
		
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName;
	
	
	@FindBy(id="personal_txtEmployeeId")
	private WebElement empID;
	
	public void verifyFirstName(String eFN)
	{
		String aFN =firstName.getAttribute("value");
		Assert.assertEquals(aFN, eFN);
	}
	
	public String getEmpId()
	{
		return empID.getAttribute("value");
	}

}
