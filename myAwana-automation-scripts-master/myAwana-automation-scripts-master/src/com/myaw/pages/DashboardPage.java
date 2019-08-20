package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage extends BasePage {

    private static final By clickLeftTopProfileImage = By.className("img-profile");
    private static final By clickLogOut = By.xpath("//a[@style='cursor: pointer;']");
    private static final By clickProfilelink = By.linkText("PROFILE & SETTINGS");
    private static final By clickAddChurch = By.linkText("Add Your Church");
    private static final By clickMyChurchTab = By.xpath("//span[contains(text(),\"My Church\")]");
    private static final By myAccountTab = By.xpath("//*[contains(text(),\"My Account\")]");
    private static final By myProfileLink = By.linkText("My Profile");
    private static final By listOfRecentOrders = By.xpath("//ul[@class='row list']");
    private static final By messageIncompleteProfile = By.className("para-txt");
    private static final By completeProfileButton = By.xpath("//button[contains(text(),'Complete Profile')]");
    private static final By notNowButton = By.xpath("//button[contains(text(),'Not Now')]");
    private static final By noOrdersMessage = By.xpath("//p[@class='para-txt']");
    private static final By shopMoreButton = By.xpath("//a[contains(text(),'Shop More')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void logOut() {
        driver.findElement(clickLeftTopProfileImage).click();
        driver.findElement(clickLogOut).click();
    }

    public void clickAddChurchLink() {
        driver.findElement(clickProfilelink).click();
        driver.findElement(clickAddChurch).click();
    }

    public void selectChurch(String churchName) {
        driver.findElement(clickMyChurchTab).click();
        churchName = "\"" + churchName + "\"";
        driver.findElement(By.xpath("//h6[contains(text()," + churchName + ")]")).click();
    }

    public boolean myChurchIsDisplayed() {
        return driver.findElement(clickMyChurchTab).isDisplayed();
    }

    public void clickMyProfilelink() {
        driver.findElement(clickProfilelink).click();
        driver.findElement(myProfileLink).click();
    }

    public List<WebElement> getListOfRecentOrders() {
        return driver.findElements(listOfRecentOrders);
    }

    public String getMessageIncompleteProfile() {
        return driver.findElement(messageIncompleteProfile).getText();
    }

    public Boolean isDisplayedCompleteProfileButton() {
        return driver.findElement(completeProfileButton).isDisplayed();
    }

    public Boolean isDisplayedNotNowButton() {
        return driver.findElement(notNowButton).isDisplayed();
    }

    public String getMessageNoOrders() {
        return driver.findElement(noOrdersMessage).getText();
    }

    public Boolean isDisplayedShopMoreButton() {
        return driver.findElement(shopMoreButton).isDisplayed();
    }

    public void clickMyAccountTab() {
        driver.findElement(myAccountTab).click();
    }
}
