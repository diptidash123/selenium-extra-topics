package random;

import org.testng.annotations.Test;

public class TestMethodsMultipleTimes 
{
	 @Test(invocationCount=0)
	  public void dipti()
	  {
		  System.out.println("dipti");
	  }
	  
	  @Test(invocationCount=-2)
	  public void som()
	  {
		  System.out.println("som");
	  }
	  
	  @Test(invocationCount=2)
	  public void papu()
	  {
		  System.out.println("papu");
	  }
	  
	  @Test(invocationCount=3)
	  public void bapu()
	  {
		  System.out.println("bapu");
	  }
}
