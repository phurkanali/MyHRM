package com.myaw.pages;

import com.myaw.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ManageProgramPage extends BasePage {
    private static final By editProgramButton = By.xpath("//button[contains(text(),'Edit Program')]");
    private static final By listOfProgram = By.className("total-items");
    private static final By meetingDayDropDown = By.name("meetingDay");
    private static final By noOfKids = By.name("noOfKids");
    private static final By saveProgramButton = By.xpath("//button[contains(text(),'SAVE PROGRAMS')]");
    private static final By slider  =   By.cssSelector(".input-slider.round");

    public ManageProgramPage(WebDriver driver){ super(driver);}
    public void clickEditProgramButton(){
        driver.findElement(editProgramButton).click();
    }
    public List<WebElement> getListOfProgram(){
        return driver.findElements(listOfProgram);
    }
    public Boolean meetingDayIsEnabled(){
        return driver.findElement(meetingDayDropDown).isEnabled();
    }
    public void setMeetingDayDropDown(String day){
        Select meetingDay = new Select(driver.findElement(meetingDayDropDown));
        meetingDay.selectByValue(day);
    }
    public void setNumberOfKids(String noKids){
        driver.findElement(noOfKids).clear();
        driver.findElement(noOfKids).sendKeys(noKids);
    }
    public void clickSaveProgramButton(){
        driver.findElement(saveProgramButton).click();
    }
    public void clickSlider(){
        driver.findElement(slider).click();
    }
}
