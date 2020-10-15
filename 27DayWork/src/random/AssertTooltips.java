package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTooltips 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E:/software/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     WebElement tooltip=driver.findElement(By.id("gender-help"));
	     String tooltext=tooltip.getAttribute("title");
	     
	     Assert.assertNotEquals(tooltip, tooltext);
	     System.out.println("true");
	     
	     
	}

}
