package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;



public class CreateLeadPage1 extends ProjectSpecificMethod{
	public CreateLeadPage1 enterCompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadPage1 enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}
	public CreateLeadPage1 enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}
	public ViewLeadPage1 clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage1();
	}

}
