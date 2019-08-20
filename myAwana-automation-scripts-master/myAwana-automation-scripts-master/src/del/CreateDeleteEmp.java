package del;

import org.testng.annotations.Test;

import com.myaw.base.BaseTest;
import com.myaw.pages.AddSourcePage;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.DetailsPage;
import com.myaw.pages.InfoPage;

public class CreateDeleteEmp extends BaseTest
{
	@Test
	
	public void testCreateDeleteEmp()
	{
		DashboardPage dbPage = new DashboardPage(driver);
	//	dbPage.clickPIM_Menu();
		
		InfoPage eiPage = new InfoPage(driver);
		eiPage.clickAddEmp_Menu();
		
		AddSourcePage aePage = new AddSourcePage(driver);
		aePage.setFirstName("Bhanu");
		aePage.setLastName("Pfa");
		aePage.clickSave();
		
		DetailsPage pdPage = new DetailsPage(driver);
		pdPage.verifyFirstName("Bhanu");
		String empID=pdPage.getEmpId();
		pdPage.clickEmpList_Menu();
		
		eiPage.selectEmpCheckBox(empID);
		eiPage.clickDelete();
		eiPage.clickOK();
		eiPage.verifyEmpNotPresent(empID);
		
		
		
		
	}
}
