package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {
    private static final By emailBox = By.name("email");
    private static final By clickAwanaRoleDropdown = By.className("c-btn");
    private static final By inviteUserButton = By.xpath("//button");
    private static final By successMessage = By.className("para-txt");
    private static final By firstNameEdit = By.name("firstName");
    private static final By lastNameEdit = By.name("lastName");

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        driver.findElement(emailBox).sendKeys(email);
        driver.findElement(emailBox).sendKeys(Keys.TAB);
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameEdit).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(lastNameEdit).sendKeys(lastName);
    }
    public void selectAwanaRole(String awanaRole) {
        driver.findElement(clickAwanaRoleDropdown).click();
        awanaRole = "\"" + awanaRole + "\"";
        driver.findElement(By.xpath("//label[text()=" + awanaRole + "]")).click();
        driver.findElement(clickAwanaRoleDropdown).click();
    }

    public void clickInviteUserButton() {
        driver.findElement(inviteUserButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

}

