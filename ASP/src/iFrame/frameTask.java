package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		  WebElement Selectframe = driver.findElement(By.id("frm1"));
		  driver.switchTo().frame(Selectframe);
		  
		WebElement courseDrop = driver.findElement(By.id("course"));
		Select cs = new Select(courseDrop);
		cs.selectByVisibleText("Python");
		
		WebElement ideDrop = driver.findElement(By.id("ide"));
		Select is = new Select(ideDrop);
		is.selectByValue("ec");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Divya");
		
		
		
		
		
				
	}
	

}