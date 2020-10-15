package random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleAssertclass
{
 @Test
 public void verify()
 {
	 System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com");
	 String expectedTitle="dipti";
	 String actualTitle=driver.getTitle();
	 
	// Assert.assertEquals(actualTitle, expectedTitle);
	 Assert.assertNotEquals(expectedTitle, actualTitle);
	 System.out.println("both titles are same");
 }
 
	 @Test
	 public void car()
	 {
		 System.out.println("car");
	 }
 }
