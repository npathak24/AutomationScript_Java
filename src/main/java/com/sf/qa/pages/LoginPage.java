package com.sf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory
		@FindBy(name = "username")
		WebElement username;
		
		@FindBy(name="pw")
		WebElement password;
		
		@FindBy(name="Login")
		WebElement loginBtn;
		
		@FindBy(name="logo")
		WebElement logo;
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Action
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean validatePageLogo() {
			return logo.isDisplayed(); 
		}
		
		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			return new HomePage();
		}
}
