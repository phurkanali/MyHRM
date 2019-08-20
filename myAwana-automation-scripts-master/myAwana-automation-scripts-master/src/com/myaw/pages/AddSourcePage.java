package com.myaw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myaw.base.HomePage;

public class AddSourcePage extends HomePage
{

	public AddSourcePage(WebDriver driver) {
		super(driver);
	}
	
	

	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="btnSave")
	private WebElement btnSave;
	
	public void setFirstName (String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	

}
