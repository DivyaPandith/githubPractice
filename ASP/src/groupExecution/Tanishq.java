package groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Tanishq {
	
	@Test(groups = "gold")
	public void tanishq()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tanishq.co.in/");
		Reporter.log("Tanishq ");
	}

}
