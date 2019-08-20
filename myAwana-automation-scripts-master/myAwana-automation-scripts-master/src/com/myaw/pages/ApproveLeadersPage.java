package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApproveLeadersPage extends BasePage {
    private static final By approveButton = By.xpath("//button");
    private static final By successMessage = By.cssSelector(".para-txt.elle");

    public ApproveLeadersPage(WebDriver driver) {
        super(driver);
    }
    public void clickApproveButton(){
        driver.findElement(approveButton).click();
    }
    public String getSuccessMessage(){
      return   driver.findElement(successMessage).getText();
    }
}


