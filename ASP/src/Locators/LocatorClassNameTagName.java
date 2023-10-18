package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassNameTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.className("button-1 search-box-button")).click();
		
		/*
		 Exception in thread "main" org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#invalid-selector-exception
Build info: version: '4.11.0', revision: '040bc5406b'
		 */
		
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(noOfLinks.size());
		
	}

	
}
