package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.AutomateVtiger.GenericUtils.FileUtility;

public class CreateContactwithOrgNameSourceAndSaveTest {
	WebDriver driver;
	
	@Test
	public void demo() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		FileUtility flib=new FileUtility();
		String un=flib.getPropertyData("username");
		String pw=flib.getPropertyData("password");
		
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
}
}