package MyDashboard;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.LeftPaneNavigationPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyViewAllOrders extends BaseTest {

    @Test
    public void verifyViewAllOrders() throws Exception {
        LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        Thread.sleep(5000);


        leftPaneNavigationPage.clickOrderHistory();
        Thread.sleep(3000);
        String orderURL = driver.getCurrentUrl();
        Assert.assertEquals(orderURL, "http://uat.my.awana.org/order/history");
		
		
	/*	
		if(driver.getPageSource().contains("You don�t have any Orders to display")){
			log.info("Pass: Order are present");
			}else{
			log.error("Fail: You don�t have any Orders to display ");
			Assert.fail("");
		}
	*/
	/*	System.out.println("My Account displayed "+driver.findElement(By.xpath("//*[@*='pointer active']")).isDisplayed());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("(//*[@*='/dashboard'])[2]")).isDisplayed());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("//*[@*='heading']")).getText());
		System.out.println("My Dashboard displayed "+driver.findElement(By.xpath("//*[@*='para-txt']")).getText());
	*/


        dashboardPage.logOut();
        Thread.sleep(3000);


    }


}
