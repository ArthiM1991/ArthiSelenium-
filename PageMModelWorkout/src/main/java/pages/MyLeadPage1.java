package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyLeadPage1 extends ProjectSpecificMethod{
	
	public CreateLeadPage1 clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage1();
	}

}
