package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftPaneNavigationPage extends BasePage {
    private static final By clickProfilelink = By.linkText("PROFILE & SETTINGS");
    private static final By clickAddChurch = By.linkText("Add Your Church");
    private static final By myProfileLink = By.linkText("My Profile");
    private static final By myDashboard = By.xpath("//span[contains(@class,'dashboard')]");
    private static final By orderHistory = By.xpath("//a[@href='/order/history']");
    private static final By changePasswordLink = By.xpath("//a[contains(@href,'changepassword')]");

    public LeftPaneNavigationPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddChurchLink() {
        driver.findElement(clickProfilelink).click();
        driver.findElement(clickAddChurch).click();
    }

    public void clickMyProfilelink() {
        driver.findElement(clickProfilelink).click();
        driver.findElement(myProfileLink).click();
    }

    public void clickMyDashboard() {
        driver.findElement(myDashboard).click();
    }

    public Boolean isDisplayedDashboard() {
        return driver.findElement(myDashboard).isDisplayed();
    }

    public void clickOrderHistory(){
        driver.findElement(orderHistory).click();
    }

    public void clickChangePassword() {
        driver.findElement(clickProfilelink).click();
        driver.findElement(changePasswordLink).click();
    }
}
