package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Microsoft {
	@Test(groups = "smoke")
	public void launchMicrosoft()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.microsoft.com/en-in");
	}

}
