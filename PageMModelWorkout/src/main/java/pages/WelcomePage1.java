package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage1 extends ProjectSpecificMethod{
	
	public MyHomePage1 clickCrmSfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage1();
	}
	public void logout()
	{
		
	}

}
