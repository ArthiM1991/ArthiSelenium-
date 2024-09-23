package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage1;

public class CreateLeadTest extends ProjectSpecificMethod{
	@Test
	public void runCreateLead()
	{
		LoginPage1 lp=new LoginPage1();
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyFirstName();


		
		
	}

}
