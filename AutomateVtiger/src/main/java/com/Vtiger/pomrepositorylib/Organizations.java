package com.Vtiger.pomrepositorylib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.AutomateVtiger.GenericUtils.ExcelUtility;
import com.crm.AutomateVtiger.GenericUtils.WebDriverUtility;

public class Organizations {
	ExcelUtility elib=new ExcelUtility();
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrgImg;
	
	@FindBy(xpath = "//input[@class='crmbutton small create']")
	private WebElement searchBtn;
	
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement orgSearchBx;
	
	@FindBy(name = "search_field")
	private WebElement listbx;
	
	public Organizations (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrgImg() {
		return createOrgImg;
	}

	public WebElement getOrgSearchBx() {
		return orgSearchBx;
	}

	public WebElement getListbx() {
		return listbx;
	}
	
	public void selectorgno() {
		WebDriverUtility wdu=new WebDriverUtility();
		wdu.SelectOption(listbx, "Organization No");
	}
	
	public void OrgSelect() throws Throwable, Throwable {
		String orgName = elib.getExcelData("Sheet", 4, 4);
		orgSearchBx.sendKeys("orhName");
		searchBtn.click();
		
		
		
	}
	
	
}
