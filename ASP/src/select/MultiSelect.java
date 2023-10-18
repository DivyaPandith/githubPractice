package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		Select ms = new Select(listbox);
		ms.selectByIndex(0);
		ms.selectByValue("199");
		ms.selectByVisibleText("More Than INR 500 ( 55 )");
		Thread.sleep(5000);
		
		ms.deselectAll();
		
	}

}
