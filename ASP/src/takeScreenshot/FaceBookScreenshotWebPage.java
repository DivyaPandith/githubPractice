package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBookScreenshotWebPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
			
		LocalDateTime time = LocalDateTime.now();
		
		String actualTime = time.toString().replace(":","_");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+actualTime+".png");
		FileHandler.copy(temp, dest);
		
	}
}
