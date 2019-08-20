package LoginLogout;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAndLogout extends BaseTest {

    @Test
    public void verifyUserAbleToLoginLogout() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://uat.my.awana.org/dashboard");
        dashboardPage.logOut();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://uat.my.awana.org/login");
    }
}
