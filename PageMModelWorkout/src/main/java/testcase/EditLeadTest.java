package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage1;


public class EditLeadTest extends ProjectSpecificMethod{
	@Test
	public void runEditLead() throws InterruptedException
	{
		LoginPage1 el=new LoginPage1();
		el.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickFindLead()
		.enterFirstName()
		.clickFindLeadsButton()
		.clickFirstLink()
		.clickEditButton()
		.updateDepartment()
		.clickUpdateButton()
		.verifyUpdatedDetails();


		
	}

}
