package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practTakeScreenshot {

	public static void main(String[] args) throws IOException {
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		String captureTime = time.toString().replace(":", "-");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		
		File perm =  new File("./Screenshots/"+captureTime+".png");
		FileHandler.copy(temp, perm);
		System.out.println(perm);
		
	}	

}
