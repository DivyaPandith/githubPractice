package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amd {

	WebDriver driver;

	@Parameters("browser")
	@Test(groups = "smoke")

//	public void launchAmd(@Optional("chrome")  String BROWSER) {if i have to excecute within testcase
	
	public void launchAmd(String BROWSER) {
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} 
//		else {
//			driver = new FirefoxDriver();
//		}
		driver.manage().window().maximize();
		driver.get("https://www.amd.com/en.html");
	}
}
