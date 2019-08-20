package MyOrders;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.LeftPaneNavigationPage;
import com.myaw.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyOrdersNoOrderToDispalyMessage extends BaseTest {

    @Test
    public void myOrdersNoOrderToDispalyMessage() throws Exception {
        DashboardPage dashboardPage = new DashboardPage(driver);
        LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        Thread.sleep(5000);
        dashboardPage.logOut();
        Thread.sleep(3000);
        loginPage.login("automationnewuat@mailinator.com", "Test@123");

        Thread.sleep(5000);
        leftPaneNavigationPage.clickOrderHistory();
        Thread.sleep(3000);

        String verifyMessage = dashboardPage.getMessageNoOrders();
        Assert.assertEquals(verifyMessage, "You don�t have any Orders to display");

        dashboardPage.logOut();
        Thread.sleep(3000);

    }


}
