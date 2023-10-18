package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
//		Reporter.log("@BeforeSuite", true);
		Reporter.log("Establish DB connection", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("@BeforeTest", true);
	}

	@BeforeClass
	public void beforeClass() {
//		Reporter.log("@BeforeClass", true);
		Reporter.log("open Browser", true);
		
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void beforeMethod() {
//		Reporter.log("@BeforeMethod", true);
		Reporter.log("url", true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("login", true);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("adithi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Honnavar@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void afterMethod() {
//		Reporter.log("@AfterMethod", true);
		Reporter.log("logout", true);
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void afterClass() {
//		Reporter.log("@AfterClass", true);
		Reporter.log("close Browser", true);
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest", true);
	}

	@AfterSuite
	public void afterSuite() {
//		Reporter.log("@AfterSuite", true);
		Reporter.log("Close DB connection", true);
	}
}
