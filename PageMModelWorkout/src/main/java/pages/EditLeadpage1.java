package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class EditLeadpage1 extends ProjectSpecificMethod {
	
	public EditLeadpage1 updateDepartment()
	{
		driver.findElement(By.id("updateLeadForm_departmentName")).sendKeys("Test");
		return this;
	}

	public EditLeadpage1 updateCompanyName()
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf1");
		return this;
	}
	
	public ViewLeadPage1 clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage1();
	}
}
