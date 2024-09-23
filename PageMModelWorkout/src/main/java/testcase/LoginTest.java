package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage1;

public class LoginTest extends ProjectSpecificMethod{
	@Test
	public void runCreateLead()
	{
		LoginPage1 lp=new LoginPage1();
		lp.enterUsername()
		.enterPassword()
		.clickLogin();
	}
	

}
