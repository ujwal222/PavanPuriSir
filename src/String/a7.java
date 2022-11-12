package String;

import org.testng.Assert;
import org.testng.annotations.Test;

public class a7 {

	//hard
	@Test 
	public void tc01()
	{
		String a="ujwal";
		String b= "water";
		String c="ujwal";
		String d="water";
		
		//assertEquals
		Assert.assertEquals(a, c);
		Assert.assertEquals(b, d);
		
		Assert.assertNotEquals(a, c);
		
	}
	
}
