package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageLeadersPage extends BasePage {
    private static final By searchLeaders = By.xpath("//input[@type= 'text']");
    private static final By clickApproveButton = By.xpath("//a[text()= 'Approve']");
    private static final By addUser = By.xpath("//a[@href='/manage-church/leaders/add']");
    private static final By plusIcon = By.cssSelector(".icon.close-icon.icon-icon_plus_square");
    private static final By editButton = By.xpath("//a[contains(text(),'Edit')]");
    private static final By removeButton = By.cssSelector(".btn.btn-red-bor.cptr");
    public ManageLeadersPage(WebDriver driver) {
        super(driver);
    }

    public void setSearchLeader(String email) {
        driver.findElement(searchLeaders).sendKeys(email);
    }

    public void clickOnApproveButton() {
        driver.findElement(clickApproveButton).click();
    }

    public void clickAddUser(){
        driver.findElement(addUser).click();
    }
    public void clickPlusIcon(){
        driver.findElement(plusIcon).click();
    }
    public void clickEditButton(){
        driver.findElement(editButton).click();
    }

    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
}


