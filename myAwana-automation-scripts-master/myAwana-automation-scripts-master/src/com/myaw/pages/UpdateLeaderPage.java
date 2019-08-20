package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateLeaderPage extends BasePage {
    private static final By clickAwanaRoleDropdown = By.className("c-btn");
    private static final By updateButton = By.xpath("//button[contains(text(),'Update')]");
    private static final By successMessage = By.cssSelector(".para-txt.elle");

    public UpdateLeaderPage (WebDriver driver) {
        super(driver);
    }
    public void clickUpdateButton(){
        driver.findElement(updateButton).click();
    }
    public String getSuccessMessage(){
        return   driver.findElement(successMessage).getText();
    }

    public void selectAwanaRole(String awanaRole){
        driver.findElement(clickAwanaRoleDropdown).click();
        awanaRole = "\""+awanaRole+"\"";
        driver.findElement(By.xpath("//label[text()="+awanaRole+"]")).click();

        driver.findElement(clickAwanaRoleDropdown).click();
    }
}
