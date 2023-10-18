package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/1");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		Set<String> windowids = driver.getWindowHandles();
		
		for(String id:windowids) {
			System.out.println(id);
			
		}
		driver.close();
	}

}
