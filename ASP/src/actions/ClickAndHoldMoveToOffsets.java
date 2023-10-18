package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMoveToOffsets {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Actions act = new Actions(driver);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alpha");
//		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
//		act.clickAndHold(eyeIcon).perform();
		
		act.moveByOffset(1300,317).clickAndHold().perform();
	}

}
