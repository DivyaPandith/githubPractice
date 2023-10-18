package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwithTo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().equals("https://www.actitime.com/")) {
				break;
			}
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getCurrentUrl());
	}

}
