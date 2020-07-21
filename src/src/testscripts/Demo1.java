package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic.Flip;

public class Demo1 {

		public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		String url=Flip.propertydata("./p1.properties","url");
		driver.get(url);
		String iw=Flip.propertydata("./p1.properties","iw");
		
		long iw_to=Long.parseLong(iw);
		driver.manage().timeouts().implicitlyWait(iw_to, TimeUnit.SECONDS);
		
		

	}

}
