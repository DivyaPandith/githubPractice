package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		int day=10;
		String month="February";
		int year=2024;
		
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[@data-id=\"dweb-modal\"]/div[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
				
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
		}
		
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
	
	}

}
