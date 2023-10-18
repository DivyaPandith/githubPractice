package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class FaceBookScreenshotWebElement {

		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Divya");
			 WebElement passwordTF = driver.findElement(By.xpath("//input[@id='pass']"));
			 passwordTF.sendKeys("asdfghj");
			 
			 Actions action=new Actions(driver);
			 action.moveByOffset(1205, 235).click().perform();
			 Thread.sleep(1000);
			 
			 File temp = passwordTF.getScreenshotAs(OutputType.FILE);
							
			LocalDateTime time = LocalDateTime.now();
			String actualTime = time.toString().replace(":","_");
			
			File dest=new File("./Screenshots/"+actualTime+".png");
			FileHandler.copy(temp, dest);
			
		
	}

}
