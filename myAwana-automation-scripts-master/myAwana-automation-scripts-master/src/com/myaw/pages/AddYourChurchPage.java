package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddYourChurchPage extends BasePage {

    private static final By searchBox = By.id("searchDetail");
    private static final By selectFirstChurch = By.xpath("(//ul[@class='row'])[1]");
    private static final By clickAwanaRoleDropdown = By.className("c-btn");
    private static final By clickChurchRoleDropdown = By.name("selectedChurchItems");
    private static final By clickAddButton = By.xpath("//button[contains(text(), \"ADD\")]");
    private static final By clickCancelButton = By.xpath("//button[contains(text(), \"CANCEl\")]");

    public AddYourChurchPage(WebDriver driver) {
        super(driver);
    }

    public void setChurchNameInSearchBox(String churchName) {
        driver.findElement(searchBox).sendKeys(churchName);
    }

    public void selectFirstChurch() {
        driver.findElement(selectFirstChurch).click();
    }

    public void selectAwanaRole(String awanaRole) {
        driver.findElement(clickAwanaRoleDropdown).click();
        awanaRole = "\"" + awanaRole + "\"";
        driver.findElement(By.xpath("//label[text()=" + awanaRole + "]")).click();
        driver.findElement(clickAwanaRoleDropdown).click();
    }

    public void selectChurchRole(String churchRole) {
        Select churchDropDown = new Select(driver.findElement(clickChurchRoleDropdown));
        churchDropDown.selectByValue(churchRole);
    }

    public void clickOnAddButton() {
        driver.findElement(clickAddButton).click();
    }

    public void clickOnCancelButton() {
        driver.findElement(clickCancelButton).click();
    }
}
