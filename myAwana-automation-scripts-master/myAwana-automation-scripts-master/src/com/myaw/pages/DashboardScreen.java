package com.myaw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myaw.base.HomePage;

public class DashboardScreen extends HomePage {

	public DashboardScreen(WebDriver driver) {
		super(driver);
		
	}
	
	

	@FindBy(xpath="//*[@*='/order']")
	private WebElement orderLeftMenuParent;
	
	@FindBy(xpath="//*[@*='/profile']")
	private WebElement profileSettingsLeftMenuParent;
	
	@FindBy(xpath="//*[@*='/dashboard']")
	private WebElement myDashBoardLeftMenuParent;
	
/*	public void setFirstName (String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
*/	
	public void leftMenuOnDashboard()
	{
		
		orderLeftMenuParent.click();
		profileSettingsLeftMenuParent.click();
		myDashBoardLeftMenuParent.click();
		
	}
	

}
