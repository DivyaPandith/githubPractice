package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WithoutAssertion {
	@Test
	public void loginMethod() {
		WebDriver driver = new ChromeDriver();
		String expectedUrl = "https://demo.actitime.com/login.do";
		driver.get(expectedUrl);
		 
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.equals("https://demo.actitime.com/")) {
			Reporter.log("user navigated to login page",true);
		}
		else {
			Reporter.log("user failed to navigate login page",true);
		}
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
	}
}
