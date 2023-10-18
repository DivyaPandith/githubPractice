package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002 extends BaseClass {
	
	@Test
	public void removeFromCart()
	{
	      Reporter.log("Product removed from cart",true);
	}

}

