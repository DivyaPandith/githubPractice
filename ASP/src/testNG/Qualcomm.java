package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Qualcomm {

	@Test(groups = "functionality")
	public void launchQualcomm()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qualcomm.com/");
		
	}
	
	
}
