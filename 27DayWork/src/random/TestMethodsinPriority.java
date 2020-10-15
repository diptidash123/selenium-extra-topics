package random;

import org.testng.annotations.Test;

public class TestMethodsinPriority
{
	 @Test
	  public void dipti()
	  {
		  System.out.println("dipti");
	  }
	  
	  @Test(priority=1)
	  public void som()
	  {
		  System.out.println("som");
	  }
	  
	  @Test(priority=2)
	  public void papu()
	  {
		  System.out.println("papu");
	  }
	  
	  @Test(priority=3)
	  public void bapu()
	  {
		  System.out.println("bapu");
	  }
}
