package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePage extends BasePage {
    private static final By removeButtonInPopup = By.xpath("//a[contains(text(), \"Remove\")]");
    private static final By closeRemovedailogBox = By.xpath("//button[contains(@class, \"removeButtonClass\")]");
    private static final By churchNameInChurchCard = By.xpath("//h4[@class='card-head']");
    private static final By editProfileButton = By.xpath("//button[contains(text(),'Edit My Profile')]");

    public MyProfilePage(WebDriver driver) {
        super(driver);
    }
    public void deleteChurch(String churchname) throws Exception{
        churchname = "\""+churchname+"\"";
        driver.findElement(By.xpath("//h4[contains(text(),"+churchname+")]/../div/div")).click();
        driver.findElement(removeButtonInPopup).click();
        Thread.sleep(1000);
        driver.findElement(closeRemovedailogBox).click();
    }
    public String getChurchNameChurchCard(){
       return driver.findElement(churchNameInChurchCard).getText();
    }

    public void clickEditProfileButton(){
        driver.findElement(editProfileButton).click();
    }
}

