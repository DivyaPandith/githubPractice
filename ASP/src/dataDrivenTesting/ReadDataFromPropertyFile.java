package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
//		create file input stream or file reader object
		FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");

//		create respective file type object
		Properties prop = new Properties();
		
// call read method, before calling ,load file object inside properties object
		prop.load(fis);
		
//		call read/get property method
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("userName");
		String PASSWORD = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.getUsernameTextField().sendKeys(USERNAME);
		lp.getPasswaordTextField().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		
		}

}
