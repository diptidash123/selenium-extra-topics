package random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethodDependsOnEachOther 
{

	@Test()
	public void login()
	{
		Assert.fail();
		System.out.println("login");
	}
	
	@Test(dependsOnMethods="login")
	public void createcustomer()
	{
		System.out.println("create customer");
	}
	
	@Test(dependsOnMethods="createcustomer")
	public void deletecustomer()
	{
		System.out.println("delete customer");
	}
}
