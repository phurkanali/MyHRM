package com.myaw.base;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generics.Utility;

public abstract class BasePage {
	
  public WebDriverWait wait; // declared inside constructor 
	
  public Logger log=Logger.getLogger(this.getClass());
  public long timeout=Long.parseLong(Utility.getPropertyValue(AutomationConstants.CONFIG_PATH, "EXPLICIT"));
  public WebDriver driver;
 
  
  public BasePage(WebDriver driver){
	  wait = new WebDriverWait(driver,timeout); // declared out side above 
	  
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  
  //identiry element using locator
  public void verifyElementIsNotPresent(By locator) // created this method 
  {
	  try{
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  log.error("Fail: Element is Present");
		  Assert.fail();
	  }
	  catch(Exception e)
	  {
		  log.info("Pass: Element is Not Present");
	  }
  }
  
  
  public void verifyListBoxHasDuplicate(WebElement listBox, int startIndex)
  {
	  ArrayList<String> alltext = Utility.getAllTextFromListBox(listBox,startIndex);
	  boolean hasDuplicate = Utility.checkArrayListHasDuplicate(alltext);
	  Assert.assertFalse(hasDuplicate,"ListBox has Duplicate");
	  
  }
  
  public void verifyListBoxIsSorted(WebElement listBox, int startIndex)
  {
	  ArrayList<String> alltext = Utility.getAllTextFromListBox(listBox,startIndex);
	 boolean sorted = Utility.checArrayListIsSorted(alltext);
	 Assert.assertTrue(sorted,"list Box is Not Sorted");
	 
  }
  
  //wait and click method
  
  public void waitAndClick(WebElement element)
  {
	  wait.until(ExpectedConditions.elementToBeClickable(element));
	  element.click();
  }
  
  //Verify element using below two method
  
  public void verifyElementIsPresent(WebElement element)
  {
	  log.info("Verify Element is Present");
	  boolean present = Utility.verifyElementsPresent(driver, element);
	  Assert.assertTrue(present," Element is Present ");
	  log.info("Element is Present");
  }
  
  
 /* 
  //Check element is present or not
  public void verifyElementIsPresent(WebElement element) // created this method 
  {
	  try{
		  wait.until(ExpectedConditions.visibilityOf(element));
		  log.info("Element is present");
	  }
	  catch(Exception e)
	  {
		  log.info("Element is not present");
		  Assert.fail();
	  }
  }
  
  */
  
  
  //Check URL has substring 
  public void verifyURLhas(String expectedUrl){
	  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
  }
  
}
