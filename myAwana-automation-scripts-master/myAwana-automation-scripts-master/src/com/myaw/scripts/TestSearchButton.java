package com.myaw.scripts;

import org.testng.annotations.Test;

import com.myaw.base.BaseTest;
import com.myaw.pages.DashboardPage;
import com.myaw.pages.InfoPage;

public class TestSearchButton extends BaseTest
{

	@Test
	public void testSearchButton()
	{
		DashboardPage dbPage = new DashboardPage(driver);
	//	dbPage.clickPIM_Menu();
		
		InfoPage eiPage= new InfoPage(driver);
		eiPage.verifySearchBtnPresent();
	}
	
}
