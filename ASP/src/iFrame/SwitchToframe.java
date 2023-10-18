package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//		driver.switchTo().frame("iframeResult");
		WebElement DTframe = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(DTframe);
		driver.findElement(By.xpath("//button[contains(text(),'display Date and Time.')]")).click();
		
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@title='Change Orientation']")).click();
		
		
	}

}
//iframe[@name='iframeResult']