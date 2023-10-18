package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skillrary.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		 File tsSource = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tsSource);
		
		File dstFile = new File("./Screenshots/sklimg.png");
		FileHandler.copy(tsSource, dstFile);
		System.out.println(dstFile);
		

	}

}
