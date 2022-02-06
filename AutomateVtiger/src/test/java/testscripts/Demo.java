package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Vtiger.pomrepositorylib.Contacts;
import com.Vtiger.pomrepositorylib.CreateNewCont;
import com.Vtiger.pomrepositorylib.Home;
import com.Vtiger.pomrepositorylib.HomePageInfo1;
import com.Vtiger.pomrepositorylib.LoginPage;
import com.Vtiger.pomrepositorylib.Organizations;
import com.crm.AutomateVtiger.GenericUtils.BaseClass;
import com.crm.AutomateVtiger.GenericUtils.ExcelUtility;
import com.crm.AutomateVtiger.GenericUtils.FileUtility;

public class Demo extends BaseClass{
	
	
@Test
public void demo() throws Throwable {
	ExcelUtility elib=new ExcelUtility();
	
	
	HomePageInfo1 hm=new HomePageInfo1(driver);
	hm.clickCon(driver);
	
	Contacts con=new Contacts(driver);
	con.clickCreateContIcon();
	
	String lastName = elib.getExcelData("Sheet1", 3, 3);
	
	CreateNewCont createCon=new CreateNewCont(driver);
	createCon.getLastNameEdt().sendKeys(lastName);
	
	Organizations org=new Organizations(driver);
	
}
}
