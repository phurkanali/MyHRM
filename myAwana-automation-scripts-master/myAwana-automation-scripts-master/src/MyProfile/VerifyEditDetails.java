package MyProfile;

import com.myaw.base.BaseTest;
import com.myaw.pages.LeftPaneNavigationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyEditDetails extends BaseTest {

    @Test
    public void verifyEditDetails() throws Throwable {
        LeftPaneNavigationPage leftPaneNavigationPage = new LeftPaneNavigationPage(driver);

        Thread.sleep(5000);

        leftPaneNavigationPage.clickMyProfilelink();

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//button)[1]")).click();

        driver.findElement(By.name("FirstName")).clear();

        driver.findElement(By.name("FirstName")).sendKeys("Jane");

        Thread.sleep(1000);

        driver.findElement(By.name("LastName")).clear();

        Thread.sleep(1000);

        driver.findElement(By.name("LastName")).sendKeys("Old");

        WebElement month = driver.findElement(By.name("month"));

        Select monthdd = new Select(month);

        monthdd.selectByValue("12");


        WebElement date = driver.findElement(By.name("date"));

        Select datedd = new Select(date);

        datedd.selectByIndex(11);

        WebElement year = driver.findElement(By.name("year"));

        Select yeardd = new Select(year);

        yeardd.selectByIndex(18);


        driver.findElement(By.name("BillingStreet_1")).clear();

        driver.findElement(By.name("BillingStreet_1")).sendKeys("3301 S Greenfield Rd");

        driver.findElement(By.name("BillingCity")).clear();

        driver.findElement(By.name("BillingCity")).sendKeys("Gilbert");


        WebElement state = driver.findElement(By.name("BillingState"));

        Select statedd = new Select(state);

        statedd.selectByIndex(3);

        driver.findElement(By.name("BillingPostalCode")).clear();

        driver.findElement(By.name("BillingPostalCode")).sendKeys("85297-2176");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.findElement(By.className("para-txt")).getText(), "Your profile has been updated successfully!");

        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Profile Image']")).isDisplayed(), "Image verified");

        Assert.assertTrue(driver.findElement(By.cssSelector(".btn.btn-green")).isEnabled(), "Upload button verified");

//                Assert.assertEquals(driver.findElement(By.className("inner-list-row")).getText(),"Name:\r\n" +

//                                                "Automation Old\r\n" +

//                                                "Acc ID:\r\n" +

//                                                "1215974\r\n" +

//                                                "Email:\r\n" +

//                                                "automationolduat@mailinator.com\r\n" +

//                                                "Date of Birth:\r\n" +

//                                                "12-11-2001\r\n" +

//                                                "Mobile:\r\n" +

//                                                "(323) 233-3333\r\n" +

//                                                "Home:\r\n" +

//                                                "(344) 566-6666\r\n" +

//                                                "Work:\r\n" +

//                                                "(345) 555-5566" );

        //Assert.assertTrue(driver.findElement(By.className("inner-list-row")).getText().contains("Name: Automation Old Acc ID: 1215974 Email: automationolduat@mailinator.com Date of Birth: 12-11-2001 Mobile: (323) 233-3333 Home: (344) 566-6666 Work: (345) 555-5566"));

        String general = driver.findElement(By.className("inner-list-row")).getText();

        general = general.replaceAll("\\s", "");

        Assert.assertEquals(general, "Name:AutomationOldAccID:1215974Email:automationolduat@mailinator.comDateofBirth:12-11-2001Mobile:(323)233-3333Home:(344)566-6666Work:(345)555-5566");

        String billingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[1]")).getText();

        billingAddress = billingAddress.replaceAll("\\s", "");

        Assert.assertEquals(billingAddress, "BillingAddress3301SGreenfieldRdGilbert,AZ85297-2176");

        String shippingAddress = driver.findElement(By.xpath("(//div[@class='adrs-card'])[2]")).getText();

        shippingAddress = shippingAddress.replaceAll("\\s", "");

        Assert.assertEquals(shippingAddress, "ShippingAddress3301SGreenfieldRdGilbert,AZ85297-2176");

    }


}
