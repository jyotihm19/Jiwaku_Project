package com.Vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.AutomateVtiger.GenericUtils.WebDriverUtility;

public class Contacts extends WebDriverUtility {
	WebDriver driver;
	public Contacts (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createConIcon;
	
	@FindBy(xpath = "//a[.='Bhagya Y M']")
	private WebElement Bhagya;
	
	@FindBy(linkText ="More Information")
	private WebElement MoreInfo;
	
	
	public WebElement getCreateConIcon() {
		return createConIcon;
	}
	
	public void clickCreateContIcon () {
		createConIcon.click();
	}

	public WebElement getBhagya() {
		return Bhagya;
	}

	public WebElement getMoreInfo() {
		return MoreInfo;
	}
	
	public void moveToMoreInfo() {
		
		Actions a=new Actions(driver);
		a.moveToElement(MoreInfo);
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}
