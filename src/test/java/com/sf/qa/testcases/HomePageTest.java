package com.sf.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sf.qa.base.TestBase;
import com.sf.qa.pages.ContactsPage;
import com.sf.qa.pages.HomePage;
import com.sf.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitleTest() {
		String title1 = homePage.verifyHomePageTitle();
		Assert.assertEquals(title1, "Lightning Experience", "Home Page Title not matching");
	}
	
	@Test
	public void searchAndClickContactsTest() {
		contactsPage = homePage.searchAndClickContacts();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
