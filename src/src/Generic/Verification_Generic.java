package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class Verification_Generic {
	public void verifyTitle(WebDriver driver,String title)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching", true);
			
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
			
		}
		
	}
	public void verifyElement(WebDriver driver, WebElement ele)
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("Element is Present",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present", true);
			Assert.fail();
		}
	}
	
	
	
	
	
	
	
	
	

}
