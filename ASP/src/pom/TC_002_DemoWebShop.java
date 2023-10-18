package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/register");
		DemoWebShopLoginPage dlg = new DemoWebShopLoginPage(driver);
		dlg.getFemaleButton().click();
		dlg.getFirstNameTF().sendKeys("Emily");
		dlg.getLastNameTF().sendKeys("Hamilton");
		dlg.getEmailTF().sendKeys("emily@gmail.com");
		dlg.getPasswordTF().sendKeys("hamiltoN@123");
		dlg.getConfirmPasswordTF().sendKeys("hamiltoN@123");
		dlg.getRegisterButton().click();

	}

}
