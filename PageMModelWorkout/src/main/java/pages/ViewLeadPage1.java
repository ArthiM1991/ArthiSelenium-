package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewLeadPage1 extends ProjectSpecificMethod {
	public ViewLeadPage1() {

	}
	 public ViewLeadPage1 verifyFirstName() {
	        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	        System.out.println(text);
	        //verification
	        if(text.contains(text)) {
	            System.out.println("Lead is created");
	        }
	        else {
	            System.out.println("Lead is not created");
	        }
	        return this;
	    }
	 
	 public EditLeadpage1 clickEditButton()
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			return new EditLeadpage1();
		}

	 public ViewLeadPage1 verifyUpdatedDetails()
		{
		 String text1 = driver.findElement(By.id("viewLead_departmentName_sp")).getText();
		 System.out.println(text1);
		 if(text1.contains("Test"))
		 {
			System.out.println("Lead is updated with updated details");
		}
		 else
		 {
			 System.out.println("Lead is not updated");
		 }
		 return this;
		}
		 
		 
		 public MyLeadPage1 clickDelBtn()
			{
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				return new MyLeadPage1();
			}
	 
}

