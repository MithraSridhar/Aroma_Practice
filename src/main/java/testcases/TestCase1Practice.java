package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BookResultPage;
import pages.LoginPage;
import pages.ProfilePage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1Practice extends ProjectSpecificWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Book search for Git Pocket Guide";
		browserName="chrome";
		dataSheetName="TC001";
		category="Smoke";
		authors="Mithra";
	}
	@Test(dataProvider="fetchData")
	public void testCase1(String UN,String PW) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(UN)
		.enterPassword(PW)
		.clickLogin()
		.clickBookStore()
		.enterSearchText("Git Pocket Guide")
		.clickSearchResult("Git")
		.getTitle();
		new BookResultPage(driver, test)
		.clickLogOut();	
	}
	
}
