package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FlntWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://shoppersstack.com/products_page/2");
		driver.findElement(By.id("Check Delivery")).sendKeys("960018");
		WebElement checkButton = driver.findElement(By.id("Check"));
		FluentWait fwait=new FluentWait(driver);
		fwait.pollingEvery(Duration.ofMillis(200));
		fwait.withTimeout(Duration.ofSeconds(4));
		fwait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}

}
