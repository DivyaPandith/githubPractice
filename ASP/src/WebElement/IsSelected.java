package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement option = driver.findElement(By.xpath("//option[@value='500']"));
		System.out.println(option.isSelected());
		option.click();
		System.out.println(option.isSelected());
	}

}
