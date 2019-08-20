package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ChurchDashboardPage extends BasePage {
    private static final By clickManageChurchLink = By.linkText("MANAGE CHURCH");
    private static final By clickManageLeaders = By.linkText("Manage Leaders");
    private static final By listOfRecentOrder = By.xpath("//ul[@class='row list']");
    private static final By orderLink = By.linkText("ORDERS");
    private static final By orderHistoryLink = By.xpath("//a[@href='/order/history']");
    private static final By pagination  =   By.xpath("//li[@class='current']");
    private static final By orderDate = By.xpath("//ul[@class='row list']/li[4]");
    public static final By manageProgramLink = By.xpath("//a[@href='/manage-church/programs']");


    public ChurchDashboardPage(WebDriver driver) {
        super(driver);
    }

    public void clickManageLeaders() {
        driver.findElement(clickManageChurchLink).click();
        driver.findElement(clickManageLeaders).click();
    }

    public List<WebElement> getListOfRecentOrders() {
        return driver.findElements(listOfRecentOrder);
    }

    public void clickOrderHistoryLink() {
        driver.findElement(orderHistoryLink).click();
    }
    public Boolean paginationIsDisplayed(){
       return driver.findElement(pagination).isDisplayed();
    }

    public List<WebElement> getOrderDate(){
       return driver.findElements(orderDate);
    }

    public void clickManageProgramLink(){
        driver.findElement(manageProgramLink).click();
    }
}
