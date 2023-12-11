package week2.day3;

import java.time.Duration;

import org.jsoup.select.Evaluator.ContainsOwnText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.EqualsMethod;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()=\"Accounts\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
		String accountname="Arthi12";
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accountname);
		driver.findElement(By.xpath("//textarea[contains(@name,'descr')]")).sendKeys("Selenium Automation Tester.");
		WebElement industry = driver.findElement(By.xpath("//Select[@name='industryEnumId']"));
		Select ind=new Select(industry);
		ind.selectByIndex(4);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sour=new Select(source);
		sour.selectByValue("LEAD_EMPLOYEE");
		WebElement marketCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select mcId=new Select(marketCampaign);
		mcId.selectByIndex(5);
		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select prov=new Select(province);
		prov.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		 String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		 System.out.println(text);
		 if(text.contains(accountname))
				 {
			 System.out.println("The account name is correct");
				 }
		 else
			 System.out.println("the account name is incorrect");
//		driver.close();
	}

}

