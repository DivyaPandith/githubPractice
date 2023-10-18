package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroollIntoView {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://skillrary.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement services = driver.findElement(By.xpath("//h2[text()='Our Services']"));
		js.executeScript("arguments[0].scrollIntoView(true)",services);

	}

}

