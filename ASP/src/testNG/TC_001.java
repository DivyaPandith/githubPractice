package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001 extends BaseClass {
	@Test
	public void addToCart()
	{
	      Reporter.log("Product added to cart",true);
	}

}
