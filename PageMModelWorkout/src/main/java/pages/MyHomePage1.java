package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;



public class MyHomePage1 extends ProjectSpecificMethod {

	public MyLeadPage1 clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage1();
	}
}
