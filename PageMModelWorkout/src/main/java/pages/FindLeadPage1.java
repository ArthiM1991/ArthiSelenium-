package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class FindLeadPage1  extends ProjectSpecificMethod{

	public FindLeadPage1 enterFirstName()
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		return this;
	}
	
	public FindLeadPage1 clickFindLeadsButton()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage1 clickFirstLink() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a")).click();
		return new ViewLeadPage1();
	}
	
}
