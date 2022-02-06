package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Vtiger.pomrepositorylib.Contacts;
import com.Vtiger.pomrepositorylib.HomePageInfo1;
import com.Vtiger.pomrepositorylib.LoginPage;
import com.crm.AutomateVtiger.GenericUtils.FileUtility;

public class Tc_01Contact {
	WebDriver driver;
	FileUtility flib=new FileUtility();
@Test
public void Tc_01ContactTest() throws Throwable {
	String un=flib.getPropertyData("usernmae");
	String pw=flib.getPropertyData("password");
	driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	LoginPage lgnPg=new LoginPage(driver);
	lgnPg.loginToapp(un, pw);
	
	
	
}
}
