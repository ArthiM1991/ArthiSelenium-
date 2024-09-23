package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage1;

public class FindLeadTest extends ProjectSpecificMethod {
	@Test
	public void runFindLead() throws InterruptedException
	{
	
	LoginPage1 fl1=new LoginPage1();
	fl1.enterUsername()
	.enterPassword()
	.clickLogin()
	.clickCrmSfa()
	.clickLead()
	.clickFindLead()
	.enterFirstName()
	.clickFindLeadsButton()
	.clickFirstLink()
	.verifyFirstName();
	}
	
}
