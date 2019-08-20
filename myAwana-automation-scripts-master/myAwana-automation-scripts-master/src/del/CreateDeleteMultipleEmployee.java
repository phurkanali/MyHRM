package del;

import generics.Utility;

import org.testng.annotations.Test;

import com.myaw.base.BaseTest;
import com.myaw.pages.AddSourcePage;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.DetailsPage;
import com.myaw.pages.InfoPage;

public class CreateDeleteMultipleEmployee extends BaseTest {
	
	@Test
	public void testCreateDeleteAllEmp()
	{
		DashboardPage dbPage = new DashboardPage(driver);
	//	dbPage.clickPIM_Menu();
		
		InfoPage eiPage = new InfoPage(driver);
		
		int rc= Utility.getExcelRowCount(INPUT_PATH, "emp");
		for (int i=1;i<=rc;i++)
		{
			
			eiPage.clickAddEmp_Menu();
			String FN=Utility.getExcelCellValue(INPUT_PATH, "emp",i,0 );
			String LN=Utility.getExcelCellValue(INPUT_PATH, "emp",i,1 );
					
			AddSourcePage aePage = new AddSourcePage(driver);
			aePage.setFirstName(FN);
			aePage.setLastName(LN);
			aePage.clickSave();
			
		}
		
		
		
		DetailsPage pdPage = new DetailsPage(driver);
	//	pdPage.verifyFirstName("Bhanu");
		//String empID=pdPage.getEmpId();
		pdPage.clickEmpList_Menu();
		
	//	eiPage.selectEmpCheckBox(empID);
		eiPage.clickSelectAllChkBox();
		eiPage.clickDelete();
		eiPage.clickOK();
	//	eiPage.verifyEmpNotPresent(empID);
		
		eiPage.verifyNoRecFoundMsgIsDisplayed();
		
		
		
		
	}

}
