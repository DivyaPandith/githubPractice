package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\User\\Downloads\\ONLINE_20230516010960000865207588718479184.pdf");
	}

}
