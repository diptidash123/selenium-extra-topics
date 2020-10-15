package random;

import org.testng.annotations.Test;

public class TwoTestMethoddependEachother 
{
  @Test(dependsOnMethods="papu")
  public void dipti()
  {
	  System.out.println("dipti");
  }
  
  @Test(dependsOnMethods="dipti")
  public void papu()
  {
	  System.out.println("papu");
  }
}
