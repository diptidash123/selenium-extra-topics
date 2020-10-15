package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleSoftassert 
{
	@Test
	 public void verify()
	 {
		 System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com");
		 String expectedTitle="dipti";
		 String actualTitle=driver.getTitle();
		 
		 SoftAssert s=new SoftAssert();
		 s.assertEquals(actualTitle, expectedTitle);
		 System.out.println("dipti");
		 s.assertAll();
		 System.out.println("cadadadda");
	 }
	 
		 @Test
		 public void som()
		 {
			 System.out.println("som");
		 }
}
