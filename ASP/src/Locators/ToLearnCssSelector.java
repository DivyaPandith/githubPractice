package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelector {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("trainee");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
