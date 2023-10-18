package practicelistner;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class PracticeBaseClass {

	static WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		Reporter.log("launch browser");
		Reporter.log("url");

	}

	@BeforeMethod
	public void login() {
		Reporter.log("enter user name and password");
		Reporter.log("logged in");
	}

	@AfterMethod
	public void logOut() {
		Reporter.log("log out");
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log(" close browser ");
	}

}
