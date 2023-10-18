package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/1");
		Thread.sleep(10000);
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("compare")).click();
		Set<String> windowIds = driver.getWindowHandles();
		for (String id : windowIds) {
			driver.switchTo().window(id);
			System.out.println(id);
			System.out.println(driver.getCurrentUrl());
			driver.close();
		} 
	}
}
