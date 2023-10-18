package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysEnter {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).clear();
		
				
	}

}

