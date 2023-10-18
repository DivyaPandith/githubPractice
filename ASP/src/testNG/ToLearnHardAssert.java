package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void loginMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle = "actiTIME - ";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle,"User failed to naavigate to login page");
		Reporter.log("user navigated to login page",true);
		
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
	}

}
