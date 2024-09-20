package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewLeadPage1 extends ProjectSpecificMethod {
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

}
