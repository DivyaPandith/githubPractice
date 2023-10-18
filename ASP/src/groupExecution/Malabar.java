package groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Malabar {

	@Test(groups = "diamonds")
	public void malabar()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.malabargoldanddiamonds.com/");
		Reporter.log("Malabar Gold and Diamonds");
	}


}
