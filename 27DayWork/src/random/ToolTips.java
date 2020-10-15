package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips 
{

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver","D:/software for selenium version/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     WebElement tooltip=driver.findElement(By.id("gender-help"));
     String tooltext=tooltip.getAttribute("title");
     //if(tooltext.equalsIgnoreCase("Click for more information"))
     // if(tooltext.equals("Click for more information"))
     if(tooltext.equals("dipti"))
     {
    	 System.out.println("true");
     }
     else
     {
    	 System.out.println("false");
     }
	}

}
