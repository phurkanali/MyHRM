package MyDashboard;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyNoOrderToDispalyMessage extends BaseTest {

    @Test
    public void verifyNoOrderToDispalyMessage() throws Exception {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        Thread.sleep(5000);
        dashboardPage.logOut();
        Thread.sleep(1000);
        loginPage.login("automationnewuat@mailinator.com","Test@123");
        Thread.sleep(5000);

        String verifyMessage = dashboardPage.getMessageNoOrders();
        Assert.assertEquals(verifyMessage, "You don�t have any Orders to display");

        dashboardPage.logOut();
        Thread.sleep(3000);

    }


}
