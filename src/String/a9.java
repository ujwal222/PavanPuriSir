package String;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a9 {

	//soft
	@Test 
	public void tc01()
	{
		String a="ujwal";
		String b= "water";
		String c="ujwal";
		String d="water";
		
		//assertEquals
//		Assert.assertEquals(a, b);
//		Assert.assertEquals(b, d);
		
		
		SoftAssert w1= new SoftAssert();
		w1.assertEquals(a, b);
		w1.assertEquals(b, d);
		w1.assertAll();
		
	}
	
}
