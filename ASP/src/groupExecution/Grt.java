package groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grt {
	
	@Test(groups = "gold")
	public void grt()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.grtjewels.com/");
		Reporter.log("Grt");
	}

}
