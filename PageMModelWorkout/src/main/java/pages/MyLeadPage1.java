package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyLeadPage1 extends ProjectSpecificMethod{
	
	public CreateLeadPage1 clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage1();
	}

	public FindLeadPage1 clickFindLead()
	{

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		return new FindLeadPage1();
	}

	
}
