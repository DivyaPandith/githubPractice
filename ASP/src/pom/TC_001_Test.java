package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001_Test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lpg = new LoginPage(driver);
		lpg.getUsernameTextField().sendKeys("trainee");
		lpg.getPasswaordTextField().sendKeys("trainee");
		lpg.getLoginButton().click();

	}

}
