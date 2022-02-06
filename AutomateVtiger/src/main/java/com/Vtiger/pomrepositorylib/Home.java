package com.Vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//td[@class='tabSelected']")
	private WebElement ContactsBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactsBtn() {
		return ContactsBtn;
	}
	

}
