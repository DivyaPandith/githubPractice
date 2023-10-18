package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.actitime.com/login.do");
		
//		 imp: without pom we get stale element exception ...................
		
//		WebElement userName = driver.findElement(By.id("username"));
//		userName.sendKeys("Divya");
//		driver.navigate().refresh();
//		userName.clear();

		//		using pom class staleElement exception handled.....................................................
		
		LoginPage lpg = new LoginPage(driver);
		lpg.getUsernameTextField().sendKeys("trainee");
		
	    driver.navigate().refresh();
	    lpg.getUsernameTextField().clear();
	
		

	}

}
