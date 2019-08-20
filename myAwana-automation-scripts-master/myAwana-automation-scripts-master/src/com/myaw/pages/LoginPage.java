package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	private static final By setUsername = By.name("email");
	private static final By setPassword = By.name("password");
	private static final By clickLoginButton = By.xpath("//*[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String un,String pw){
	    driver.findElement(setUsername).sendKeys(un);
	    driver.findElement(setPassword).sendKeys(pw);
	    driver.findElement(clickLoginButton).click();
	}
}

