package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.LoginPage;

//@Listeners(ListnerImplementation.class)
public class ListnerTestScript extends ListnerBaseClass {
	@Test
	public void login() {
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp = new LoginPage(driver);
		lp.getUsernameTextField().sendKeys("trainee");
		lp.getPasswaordTextField().sendKeys("trainee");
		lp.getLoginButton().click();
		Assert.fail();
	}

}
