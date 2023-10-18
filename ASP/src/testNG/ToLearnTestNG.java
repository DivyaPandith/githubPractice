package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {//	TestNG class if atleast one @Test is present
	
// A method declared with @Test  is called Test case  
	
	@Test(priority = 1,invocationCount = 3,threadPoolSize = 3)
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("logged in successfully");
	}
	
	@Test(priority = 2,enabled = false)  
	public void browserSetUp()
	{
//	TestSteps
//		System.out.println("Hi");
		Reporter.log("Hello Welcome to TestNG",true);
	}
	
	

}
