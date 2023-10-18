package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		WebElement daydrop = driver.findElement(By.id("day"));
		Select ds = new Select(daydrop);
		ds.selectByIndex(21);
		 WebElement monthdrop = driver.findElement(By.id("month"));
		 Select ms = new Select(monthdrop);
		 ms.selectByIndex(1);
		 WebElement yeardrop = driver.findElement(By.id("year"));
		 Select ys = new Select(yeardrop);
		 ys.selectByValue("2019");
	}

}
