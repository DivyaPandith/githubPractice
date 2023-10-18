package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apple {
	WebDriver driver;

	@Parameters("browser")

	@Test(groups = "functionality")
	public void launchApple(String BROWSER) {
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/");

	}

}
