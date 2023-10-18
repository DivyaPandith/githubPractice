package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Dimension size = driver.findElement(By.className("productNameContainer")).getSize();
		System.out.println("Height:" + size.getHeight());
		System.out.println("Width:"+ size.getWidth());

	}

}
