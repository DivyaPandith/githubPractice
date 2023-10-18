package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegister {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abc");
		driver.findElement(By.id("LastName")).sendKeys("Xyz");
		driver.findElement(By.id("Email")).sendKeys("Abcxyz@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("A@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("A@123");
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.className("field-validation-error")).getText());
		driver.findElement(By.id("Password")).sendKeys("ax@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ax@123");
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.className("validation-summary-errors")).getText());
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("lkjhgas@gmail.com");
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
