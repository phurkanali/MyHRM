package MyOrders;

import com.myaw.base.BaseTest;
import com.myaw.pages.LeftPaneNavigationPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyOrdersPagination extends BaseTest {

    @Test
    public void verifyViewAllOrders() throws Exception {
        LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);
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


        driver.findElement(By.xpath("(//*[@*='icon-icon_arrow_down dropdown-arrow'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a)[13]")).click();
        Thread.sleep(3000);


    }


}
