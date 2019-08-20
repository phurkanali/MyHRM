package ManageLeaders;

import com.myaw.base.BaseTest;
import com.myaw.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ManageLeaderUpdate extends BaseTest {

    @Test
    public void manageLeaderUpdate() throws Throwable {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        ManageLeadersPage manageLeadersPage = new ManageLeadersPage(driver);
        AddUserPage addUserPage = new AddUserPage(driver);
        UpdateLeaderPage updateLeaderPage = new UpdateLeaderPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dashboardPage.selectChurch("BEETHAL");
        churchDashboardPage.clickManageLeaders();
        Thread.sleep(1000);
        manageLeadersPage.clickAddUser();
        Thread.sleep(1000);
        addUserPage.setEmail("automationsecond@mailinator.com");
        Thread.sleep(5000);
        addUserPage.selectAwanaRole("Club Secretary");
        addUserPage.clickInviteUserButton();
        Thread.sleep(3000);
        Assert.assertEquals(addUserPage.getSuccessMessage(),
                "User has been invited to join a church in MyAwana!");
        Thread.sleep(6000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://uat.my.awana.org/manage-church/leaders");
        Thread.sleep(5000);
        manageLeadersPage.setSearchLeader("automationsecond@mailinator.com");
        Thread.sleep(5000);
        manageLeadersPage.clickPlusIcon();
        Thread.sleep(3000);
        manageLeadersPage.clickEditButton();
        Thread.sleep(5000);
        updateLeaderPage.selectAwanaRole("Commander");
        Thread.sleep(2000);
        updateLeaderPage.clickUpdateButton();
        Thread.sleep(3000);
        Assert.assertEquals(updateLeaderPage.getSuccessMessage(), "You have successfully updated Automation Second account");
        Thread.sleep(3000);
        manageLeadersPage.setSearchLeader("automationsecond@mailinator.com");
        Thread.sleep(5000);
        manageLeadersPage.clickPlusIcon();
        Thread.sleep(5000);
        manageLeadersPage.clickRemoveButton();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".para-txt")).getText(),
                "You have successfully Removed Automation Second Account");
    }
    @AfterClass
    public void removeUser() throws Throwable {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        ManageLeadersPage manageLeadersPage = new ManageLeadersPage(driver);
        AddUserPage addUserPage = new AddUserPage(driver);
        UpdateLeaderPage updateLeaderPage = new UpdateLeaderPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dashboardPage.clickMyAccountTab();
        Thread.sleep(5000);
        dashboardPage.selectChurch("BEETHAL");
        churchDashboardPage.clickManageLeaders();
        Thread.sleep(5000);
        manageLeadersPage.setSearchLeader("automationsecond@mailinator.com");
        Thread.sleep(5000);
        manageLeadersPage.clickPlusIcon();
        Thread.sleep(5000);
        manageLeadersPage.clickRemoveButton();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".para-txt")).getText(),
                "You have successfully removed Automation Second's account");
    }
}
