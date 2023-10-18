package webdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();

		driver.get("https://shoppersstack.com/products_page/1");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		driver.close();
	}
}
		