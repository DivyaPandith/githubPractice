package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeBasedScreenshot {

	public static void main(String[] args) throws IOException {
		LocalDateTime Time = LocalDateTime.now();
		System.out.println(Time);
		String actTime = Time.toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot) driver;// type cast

		File tsSource = ts.getScreenshotAs(OutputType.FILE);// temp file loc

		System.out.println(tsSource);

		File dstFile = new File("./Screenshots/"+actTime+".png");// dest file loc

		FileHandler.copy(tsSource, dstFile);// move
		System.out.println(dstFile);
		
	}

}
