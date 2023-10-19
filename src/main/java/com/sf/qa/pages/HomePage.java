package com.sf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//div[@class='slds-r5']")
	WebElement applauncher;
	
	@FindBy(id="input-121")
	WebElement search;
	
	@FindBy(id="07p2v0000009DTuAAM")
	WebElement searchresult;
	
	@FindBy(xpath="//span[contains(text(),Contacts)]")
	WebElement contactlink;
	
	@FindBy(xpath="//svg[contains(text(),chevrondown")
	WebElement arrow;
	
	@FindBy(xpath="//a[contains(text(),New)]")
	WebElement newBtn;
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="Phone")
	WebElement phone;
	
	@FindBy(name="SaveEdit")
	WebElement saveBtn;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage searchAndClickContacts() {
		applauncher.click();
		search.sendKeys("marketing");
		searchresult.click();
		contactlink.click();
		return new ContactsPage();
	}


}
