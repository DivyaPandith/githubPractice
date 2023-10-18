package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementLocation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		Point position = driver.findElement(By.className("productNameContainer")).getLocation();
		System.out.println("X:" + position.getX());
		System.out.println("Y:" + position.getY());
		Rectangle rect = driver.findElement(By.className("productNameContainer")).getRect();
		System.out.println(rect);
		System.out.println("Height: " + rect.getHeight());
		System.out.println("width: " + rect.getWidth());
		System.out.println("X Cord: " + rect.getX());
		System.out.println("Y Cord: " + rect.getY());
		
	}

}
