package String;

import org.testng.annotations.Test;

public class a6 {

	@Test (priority=4)
	public void tc01()
	{
		System.out.println("tc01");
	}
	
	@Test  (timeOut=2000)
	public void tc02() throws InterruptedException
	{
		System.out.println("tc02");
		//Thread.sleep(2100);
	}
	
//	@Test (priority=3, invocationCount=3 )
//	public void tc03()
//	{
//		System.out.println("tc03");
//	}
//	
	@Test (dependsOnMethods="tc02")
	public void tc04()
	{
		System.out.println("tc04");
	}
	
}
