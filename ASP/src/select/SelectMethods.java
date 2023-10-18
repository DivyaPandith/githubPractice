package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement mulsel = driver.findElement(By.id("cars"));
		Select ms = new Select(mulsel);
		ms.selectByIndex(3);
		ms.selectByValue("99");
		ms.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
		System.out.println(ms.isMultiple());
		
		System.out.println("---------------------------------------------------------");
		
		List<WebElement> allOpt = ms.getOptions();
		for(WebElement ele: allOpt)
		{
			System.out.println(ele.getText());
			
		}
		
		WebElement FselOpt = ms.getFirstSelectedOption();
		System.out.println(FselOpt.getText());
		System.out.println("---------------------------------------------------------");
		List<WebElement> allSelOpt = ms.getAllSelectedOptions();
		for(WebElement SelOpt:allSelOpt )
		{
			System.out.println(SelOpt.getText());
		}
	}

}
