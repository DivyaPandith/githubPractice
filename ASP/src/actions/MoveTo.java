package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act = new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement COMPUTERS = driver.findElement(By.partialLinkText("COMPUTERS"));
		act.moveToElement(COMPUTERS).perform();
		
		
	}

}
