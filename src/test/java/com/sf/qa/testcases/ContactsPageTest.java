package com.sf.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.sf.qa.base.TestBase;
import com.sf.qa.pages.ContactsPage;
import com.sf.qa.pages.HomePage;
import com.sf.qa.pages.LoginPage;
import com.sf.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	String sheetName = "xyz";
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public void getSFTestData() throws InvalidFormatException {
		TestUtil.getTestData(sheetName);
			}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
