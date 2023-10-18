
package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pract {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);
		WebElement MenuSelect = driver.findElement(By.id("selectnav1"));
		Select ms = new Select(MenuSelect);
		ms.selectByVisibleText("-- Selenium");
		
//		System.out.println(ms.getOptions());
//		System.out.println(ms.getAllSelectedOptions());
//		ms.isMultiple();
		
	}}