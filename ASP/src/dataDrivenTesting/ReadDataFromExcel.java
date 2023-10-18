package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("./TestData/Book1.xlsx");
		
		Workbook workBookObject = WorkbookFactory.create(fs);
		String url = workBookObject.getSheet("1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String userName = workBookObject.getSheet("1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(userName);
		
		String password = workBookObject.getSheet("1").getRow(1).getCell(2).toString();
		System.out.println(password);
		
		double fees = workBookObject.getSheet("1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(fees);
		
		LocalDateTime date = workBookObject.getSheet("1").getRow(1).getCell(4).getLocalDateTimeCellValue();
		System.out.println(date);
		
		boolean status = workBookObject.getSheet("1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName);
		
	LoginPage lp = new LoginPage(driver);
	lp.getPasswaordTextField().sendKeys(password);
	lp.getLoginButton().click();
		
		
		
	}

}
