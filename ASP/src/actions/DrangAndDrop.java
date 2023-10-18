package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act = new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		WebElement img1 = driver.findElement(By.xpath("//h5[contains(text(),'High Tatras 3')]"));
		WebElement dest = driver.findElement(By.id("trash"));
		act.dragAndDrop(img1, dest).perform();
		
		WebElement source = driver.findElement(By.id("gallery"));
		act.dragAndDrop(img1,source).perform();
	}

}
