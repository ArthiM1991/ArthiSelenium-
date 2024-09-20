package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage1 extends ProjectSpecificMethod {
	
	public LoginPage1 enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	public LoginPage1 enterPassword()
	{
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 return this;
	}
	public WelcomePage1 clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage1();
	}

}
