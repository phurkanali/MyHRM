package ManagePrograms;

import com.myaw.base.BaseTest;
import com.myaw.pages.ChurchDashboardPage;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.ManageProgramPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class EditManagePrograms extends BaseTest {

    @Test
    //
    public void editManagePrograms() throws Throwable {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        ManageProgramPage manageProgramPage = new ManageProgramPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dashboardPage.selectChurch("BEETHAL");
        churchDashboardPage.clickManageLeaders();
        Thread.sleep(1000);
        churchDashboardPage.clickManageProgramLink();
        Thread.sleep(5000);
        manageProgramPage.clickEditProgramButton();
        ArrayList<String> listprogram = new ArrayList<String>();
        listprogram.add("Puggles");
        listprogram.add("Cubbies");
        listprogram.add("Sparks");
        listprogram.add("Truth and Training");
        listprogram.add("Trek");
        listprogram.add("Journey");
        listprogram.add("Truthseekers");
        listprogram.add("High Power Soccer");
        ArrayList<String> listprogram1 = new ArrayList<String>();
        List<WebElement> program = manageProgramPage.getListOfProgram();
        for (WebElement e : program) {
            listprogram1.add(e.getText());
        }
        Assert.assertEquals(listprogram, listprogram1);
        Boolean dropdown = manageProgramPage.meetingDayIsEnabled();
        if (dropdown) {
            manageProgramPage.setMeetingDayDropDown("Monday");
            manageProgramPage.setNumberOfKids("10");
            manageProgramPage.clickSaveProgramButton();
        } else {
            manageProgramPage.clickSlider();
            manageProgramPage.setMeetingDayDropDown("Monday");
            manageProgramPage.setNumberOfKids("10");
            manageProgramPage.clickSaveProgramButton();
        }
        Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[1]")).getText(), "YES");
        Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[2]")).getText(), "Monday");
        Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='meeting-day-txt'])[3]")).getText(), "10");
    }

}
