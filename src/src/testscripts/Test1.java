package testscripts;

import org.testng.annotations.Test;

import Generic.Generic;
import POM.EnterTimeTrack;
import POM.LoginPage;

public class Test1 extends Generic 
{
	@Test
	public void test_login() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		EnterTimeTrack ep=new EnterTimeTrack(driver);
		ep.clickLogout();
	}
	

}
