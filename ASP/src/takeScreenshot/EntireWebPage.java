package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot) driver;// type cast

		File tsSource = ts.getScreenshotAs(OutputType.FILE);// temp file loc

		System.out.println(tsSource);

		File dstFile = new File("./Screenshots/img3.png");// dest file loc

		FileHandler.copy(tsSource, dstFile);// move
		System.out.println(dstFile);

	}

}
