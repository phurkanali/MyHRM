package AddYourChurch;

import com.myaw.base.BaseTest;
import com.myaw.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AddYourChurch extends BaseTest {

    @Test
    public void addYourChurch() throws Throwable {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AddYourChurchPage addYourChurchPage = new AddYourChurchPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        ManageLeadersPage manageLeadersPage = new ManageLeadersPage(driver);
        ApproveLeadersPage approveLeadersPage = new ApproveLeadersPage(driver);
        Thread.sleep(5000);
        dashboardPage.logOut();
        loginPage.login("automationnewuat@mailinator.com", "Test@123");
        Thread.sleep(5000);
        dashboardPage.clickAddChurchLink();
        Thread.sleep(4000);
        addYourChurchPage.setChurchNameInSearchBox("Aloma");
        Thread.sleep(1000);
        addYourChurchPage.selectFirstChurch();
        Thread.sleep(1000);
        addYourChurchPage.selectAwanaRole("Commander");
        Thread.sleep(1000);
        addYourChurchPage.selectChurchRole("Missions Pastor");
        Thread.sleep(1000);
        addYourChurchPage.clickOnAddButton();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//h4[@class='card-head']")).getText(), "Aloma Church");
        dashboardPage.logOut();
        loginPage.login("automationolduat@mailinator.com", "Test@123");
        Thread.sleep(3000);
        dashboardPage.selectChurch("Aloma");
        Thread.sleep(1000);
        churchDashboardPage.clickManageLeaders();
        Thread.sleep(1000);
        manageLeadersPage.setSearchLeader("automationnewuat@mailinator.com");
        Thread.sleep(5000);
        manageLeadersPage.clickOnApproveButton();
        Thread.sleep(5000);
        approveLeadersPage.clickApproveButton();
        Assert.assertEquals(approveLeadersPage.getSuccessMessage(), "You have successfully approved Automation New account");
        Thread.sleep(3000);
        dashboardPage.logOut();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanup() throws Exception {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        dashboardPage.logOut();
        loginPage.login("automationnewuat@mailinator.com", "Test@123");
        Thread.sleep(5000);
        dashboardPage.clickMyProfilelink();
        myProfilePage.deleteChurch("Aloma");
        driver.close();
    }
}
