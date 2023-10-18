package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.DemoWebShopLoginPage;

public class ReadDemoWebShopExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fin = new FileInputStream("./TestData/DemoWebShopCredetentials.xlsx");
		
		Workbook DemoExel = WorkbookFactory.create(fin);
		String url = DemoExel.getSheet("1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String firstName = DemoExel.getSheet("1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(firstName);
		
		String lastName = DemoExel.getSheet("1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(lastName);
		
		String email = DemoExel.getSheet("1").getRow(2).getCell(3).getStringCellValue();
		System.out.println(email);
		
		String password = DemoExel.getSheet("1").getRow(2).getCell(4).getStringCellValue();
		System.out.println(password);
		
		String confirmPassword = DemoExel.getSheet("1").getRow(2).getCell(5).getStringCellValue();
		System.out.println(confirmPassword);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		DemoWebShopLoginPage registerPage = new DemoWebShopLoginPage(driver);
		registerPage.getFemaleButton().click();
		
		registerPage.getFirstNameTF().sendKeys(firstName);
		registerPage.getLastNameTF().sendKeys(lastName);
		registerPage.getEmailTF().sendKeys(email);
		registerPage.getPasswordTF().sendKeys(password);
		registerPage.getConfirmPasswordTF().sendKeys(confirmPassword);
		registerPage.getRegisterButton().click();
		
	
	}

}
