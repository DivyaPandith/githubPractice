package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopups {

	public static void main(String[] args) {
		ChromeOptions settings = new ChromeOptions();
//		settings.addArguments("--disable-notifications");
//		to open browser incognito mode this is the chromium command
		settings.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.hyundai.com/");
		
	}

}
