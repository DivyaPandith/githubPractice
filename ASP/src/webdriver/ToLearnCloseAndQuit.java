package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseAndQuit {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
