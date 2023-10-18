package testNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation extends ListnerBaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;// type cast

		File tsSource = ts.getScreenshotAs(OutputType.FILE);// temp file loc

		System.out.println(tsSource);
		LocalDateTime time = LocalDateTime.now();
		String actTime = time.toString().replace(":", "_");
		String Mtdname = result.getName();
		
		File dstFile = new File("./Screenshots/"+Mtdname+actTime+".png");// dest file loc

		// move
		try {
			FileHandler.copy(tsSource, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dstFile);
		Reporter.log("Test Failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped",true);
	}
	
	
	
	

}
