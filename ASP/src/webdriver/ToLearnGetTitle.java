package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pgsource = driver.getPageSource();
		System.out.println(pgsource);
		System.out.println(driver.getWindowHandle());
	
	}

}
