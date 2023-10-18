package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributevalueTagname {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		String av = driver.findElement(By.id("loginButton")).getAttribute("id");
		System.out.println(av);
		String Tn = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(Tn);
	}

}
