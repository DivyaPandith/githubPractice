package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigurationAnotation {

	@Test
	public void runTest3() {
		Reporter.log("Running Test Case:3", true);

	}

	@Test
	public void runTest1() {
		Reporter.log("Running Test Case:1", true);

	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("@BeforeMethod", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("@AfterMethod", true);
	}

	@Test
	public void runTest2() {
		Reporter.log("Running Test Case:2", true);

	}

	@BeforeMethod
	public void beforeMethod2() {
		Reporter.log("@BeforeMethod2", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("@BeforeClass", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("@AfterClass", true);
	}

}
