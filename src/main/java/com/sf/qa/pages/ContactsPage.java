package com.sf.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}

}
