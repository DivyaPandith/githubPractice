package practicelistner;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListnerScripImplementation extends BaseClassListner implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime sysDate = LocalDateTime.now();
		String actTime = sysDate.toString().replace(":", "-");
		Reporter.log("fail",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/"+actTime+".png");
//		File dst = new File("./Screenshots/"+actTime+".png");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Skipped",true);
	}
	

}
