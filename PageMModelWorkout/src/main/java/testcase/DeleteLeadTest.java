package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage1;

public class DeleteLeadTest extends ProjectSpecificMethod{

	@Test
	public void runDeleteLead() throws InterruptedException
	{
		LoginPage1 dl=new LoginPage1();
		dl.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickFindLead()
		.enterFirstName()
		.clickFindLeadsButton()
		.clickFirstLink()
		.clickDelBtn();
	
	}
}
