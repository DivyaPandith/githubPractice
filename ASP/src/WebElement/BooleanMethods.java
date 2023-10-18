package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
		System.out.println("=================Before sending the data==============");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
		System.out.println("=================After sending the data==============");
		username.sendKeys("testing@123");
		password.sendKeys("testing@123");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
	}
	

}
