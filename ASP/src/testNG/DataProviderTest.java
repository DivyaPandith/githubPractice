package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public String[][] dataSender1() {
		String [][] data= {{"admin","manager"},{"trainee","trainee"}};
		return data;
	}
	@DataProvider
	public String[] dataSender2() {
		String [] data= {"admin","manager"};
		return data;
	}
	
	@Test(dataProvider = "dataSender2")
	public void dataReceiver(String data) {
		System.out.println(data);
	}
	@Test(dataProvider = "dataSender1")
	public void loginMethod(String[] credential) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.id("username")).sendKeys(credential[0]);
//		driver.findElement(By.name("pwd")).sendKeys(credential[1]);
//		driver.findElement(By.id("loginButton")).click();
		System.out.println(credential[0]);
		System.out.println(credential[1]);
		System.out.println("---------------------------------");
	}
}
