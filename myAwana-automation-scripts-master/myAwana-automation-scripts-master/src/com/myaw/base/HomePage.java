package com.myaw.base;
import generics.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends BasePage{

	//@FindBy(xpath="//*[@*='Profile:Logout']")
	@FindBy(xpath="//*[@*='img-profile']")
	private WebElement LogoutMenu;
	
	@FindBy(xpath="//*[@*='cursor: pointer;']//*")
	private WebElement logout;
	
	//declared this element  
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement empList_Menu;
	
	
	
	public void clickEmpList_Menu()
	{
		empList_Menu.click();
	}
	
	public void clickPIM_Menu1()
	{
		pim_Menu.click();
	}
	
	public void clickAddEmp_Menu()
	{
		addEmp_Menu.click();
	}
	
	 
	//Created this method
	public void clickPIM_Menu()
	{
		pim_Menu.click();
	}
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void logout(){
		waitAndClick(LogoutMenu);
		
		//Utility.clickUsingJs(driver, welcome); -- using java script executor 
		LogoutMenu.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logout.click();
	}
}
