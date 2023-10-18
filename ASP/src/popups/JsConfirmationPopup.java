package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmationPopup = driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		
		Thread.sleep(2000);
//		confirmationPopup.dismiss();
		confirmationPopup.accept();
		
	}
	
}
