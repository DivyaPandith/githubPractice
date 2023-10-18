package WebElement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement section = driver.findElement(By.xpath("//div[@class='block block-category-navigation']"));
	File src = section.getScreenshotAs(OutputType.FILE);
	File trg = new File("./Screenshots/categories.png");
	FileHandler.copy(src, trg);
	
	}

}
