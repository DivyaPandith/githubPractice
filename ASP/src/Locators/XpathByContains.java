package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text ')]")).sendKeys("BOOKS");
				driver.findElement(By.xpath("//input[@type='submit' or @value='Search']")).click();
		

	}

}


