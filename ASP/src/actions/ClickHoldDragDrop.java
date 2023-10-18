package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldDragDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act = new Actions(driver);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);

		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement trashPlace = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));

		act.clickAndHold(img1).moveToElement(trashPlace).release().perform();
		act.clickAndHold(img2).moveToElement(trashPlace).release().perform();
		act.clickAndHold(img3).moveToElement(trashPlace).release().perform();
		act.clickAndHold(img4).moveToElement(trashPlace).release().perform();

		Thread.sleep(2000);
		act.clickAndHold(img1).moveToElement(gallery).release().perform();

		System.out.println("Click and hold Drag and drop exercise completed");

	}

}
