package com.myaw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.myaw.base.HomePage;

public class InfoPage extends HomePage{
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(id="empsearch_job_title")
	private WebElement jobTitleListBox;

	public InfoPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement ok;
	
	@FindBy(id="ohrmList_chkSelectAll")
	private WebElement selectAllChkBox;
	
	@FindBy(xpath="//td[.='No Records Found']")
	private WebElement noRecordsMsg;
	
	public void  verifyNoRecFoundMsgIsDisplayed()
	{
		verifyElementIsPresent(noRecordsMsg);
	}
	
	public void clickSelectAllChkBox()
	{
		selectAllChkBox.click();
	}
	
	public void selectEmpCheckBox(String empID)
	{
		String xp="//a[text()='"+empID+"']/../../input[@type='checkbox']";
		driver.findElement(By.xpath(xp)).click();
		
	}
	
	public void clickDelete()
	{
		btnDelete.click();
	}
	
	public void clickOK()
	{
		ok.click();
	}
	
	public void verifyEmpNotPresent(String empID)
	{
		By loc = By.xpath("//a[text()='"+empID+"]");
		verifyElementIsNotPresent(loc);
	}
	
	public void verifyJobTitleIsSorted()
	{
		log.info("Verify that content of jobtitle Listbox is sorted");
		verifyListBoxIsSorted(jobTitleListBox, 1);
	}
	
	public void verifyJobTitleHasNoDuplicate()
	{
		log.info("Verify that content of jobTitle list box has no duplicate Options");
		verifyListBoxHasDuplicate(jobTitleListBox, 1);
		log.info("ListBox has no Duplicate");
	}
	
	public void verifySearchBtnPresent() 
	{
		verifyElementIsPresent(searchBtn);
	}

	
		
	
		
}

