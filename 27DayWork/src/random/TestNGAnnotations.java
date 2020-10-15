package random;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
 @Test
 public void Audi()
 {
	 //System.out.println("Audi");//instead of writing this we can go for Reporter.log()
	 Reporter.log("Audi",true);
 }
 
 @Test
 public void Benz()
 {
	 Reporter.log("Benz",true);
 }
 
 @Test
 public void Bmw()
 {
	 Reporter.log("Bmw",true);
 }
 
 @BeforeMethod
 public void odisha()
 {
	 Reporter.log("odisha",true);
 }
 
 @BeforeClass
 public void vizag()
 {
	 Reporter.log("vizag",true);
 }
 
 @BeforeSuite
 public void hydrabad()
 {
	Reporter.log("hydrabad",true); 
 }
 
 @BeforeTest
 public void kolkata()
 {
	 Reporter.log("kolkata",true);
 }
 
 @AfterClass
 public void delhi()
 {
	 Reporter.log("delhi",true);
 }
 
 @AfterSuite
 public void mumbai()
 {
	 Reporter.log("mumbai",true);
 }
 
 @AfterMethod
 public void chennai()
 {
	 Reporter.log("chennai",true);
 }
 
 @AfterTest
 public void surat()
 {
	 Reporter.log("surat",true);
 }
}
