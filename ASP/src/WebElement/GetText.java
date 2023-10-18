package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String errMsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getText();
		System.out.println(errMsg);
		if (errMsg.contains("invalid")) {
			System.out.println("Proper error msg is displayed");
		} else {
			System.out.println("Proper error msg is not displayed");
		}
		String color = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getCssValue("color");
		System.out.println(color);
		System.out.println(driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getCssValue("font-family"));
		
	}

}
