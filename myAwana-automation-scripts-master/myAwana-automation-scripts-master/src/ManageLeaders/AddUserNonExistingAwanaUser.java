package ManageLeaders;

import com.myaw.base.BaseTest;
import com.myaw.pages.*;
import org.testng.annotations.Test;

import java.util.Random;

public class AddUserNonExistingAwanaUser extends BaseTest {

    @Test
    public void addUserNonExistingUser() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        ManageLeadersPage manageLeadersPage = new ManageLeadersPage(driver);
        AddUserPage addUserPage = new AddUserPage(driver);
        UpdateLeaderPage updateLeaderPage = new UpdateLeaderPage(driver);
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        String userid = saltStr + "@mailinator.com";
        Thread.sleep(5000);
        dashboardPage.selectChurch("BEETHAL");
        churchDashboardPage.clickManageLeaders();
        Thread.sleep(1000);
        manageLeadersPage.clickAddUser();
        Thread.sleep(1000);
        addUserPage.setEmail(userid);
        Thread.sleep(5000);
        addUserPage.setFirstName("auto");
        addUserPage.setLastName("user");
        addUserPage.selectAwanaRole("Club Secretary");
        addUserPage.clickInviteUserButton();
    }
}
