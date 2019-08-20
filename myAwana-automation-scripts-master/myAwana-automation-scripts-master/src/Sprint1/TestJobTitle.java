package Sprint1;

import org.testng.annotations.Test;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.InfoPage;

public class TestJobTitle extends BaseTest
{

	@Test
	public void testJobTitle()
	{
		DashboardPage dbPage = new DashboardPage(driver);
		//dbPage.clickPIM_Menu();
		
		InfoPage eiPage = new InfoPage(driver);
		eiPage.verifyJobTitleIsSorted();
		eiPage.verifyJobTitleHasNoDuplicate();
	}
}
