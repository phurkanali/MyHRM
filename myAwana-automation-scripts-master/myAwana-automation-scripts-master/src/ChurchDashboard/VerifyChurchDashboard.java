package ChurchDashboard;

import com.myaw.base.BaseTest;
import com.myaw.pages.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class VerifyChurchDashboard extends BaseTest {

    ArrayList<String> orderDateInString = new ArrayList<String>();
    ArrayList<String> sortedDate;

    // MYAW-493,495,496, 482,481 & 497
    @Test
    public void verifyChurchDashboard() throws Throwable {
        DashboardPage dashboardPage = new DashboardPage(driver);
        ChurchDashboardPage churchDashboardPage = new ChurchDashboardPage(driver);
        Thread.sleep(5000);
        dashboardPage.selectChurch("BEETHAL");
        List<WebElement> listOfOrders = churchDashboardPage.getListOfRecentOrders();
        Assert.assertEquals(5, listOfOrders.size());
        churchDashboardPage.clickOrderHistoryLink();
        Thread.sleep(2000);
        String orderURL = driver.getCurrentUrl();
        Assert.assertEquals(orderURL, "http://uat.my.awana.org/order/history");
        boolean pagination = churchDashboardPage.paginationIsDisplayed();
        Assert.assertTrue(pagination);
        List<WebElement> orderDate = churchDashboardPage.getOrderDate();
        for (WebElement a : orderDate) {
            String date = a.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
            Date date1 = formatter.parse(date);
            orderDateInString.add(new SimpleDateFormat("yyyyMMdd").format(date1));
            sortedDate = new ArrayList<String>(orderDateInString);
        }
        Collections.sort(sortedDate, Collections.reverseOrder());
        Assert.assertEquals(orderDateInString, sortedDate);
    }

}
