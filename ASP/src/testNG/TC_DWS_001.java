package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {

	@Test
	public void addCart() {
		Actions act = new Actions(driver);
		WebElement COMPUTERS = driver.findElement(By.partialLinkText("COMPUTERS"));
		act.moveToElement(COMPUTERS).perform();
		WebElement NOTEBOOKS = driver.findElement(By.partialLinkText("Notebooks"));
		act.moveToElement(NOTEBOOKS).click().perform();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

	}

}
