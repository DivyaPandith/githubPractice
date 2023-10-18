package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxis {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Downloads/sibling.html");
//		String moviename=args[0];
		System.out.println("Bhabuli collection:" + driver.findElement(By.xpath("//td[contains(text(),'Bhaabuli')]/following-sibling::td")).getText());
		System.out.println("Uri position:" + driver.findElement(By.xpath("//td[contains(text(),'Uri')]/preceding-sibling::td")).getText());

	}

}
