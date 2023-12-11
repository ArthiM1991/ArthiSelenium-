package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("firstname")).sendKeys("Arthi");
		driver.findElement(By.name("lastname")).sendKeys("Muthu");
		driver.findElement(By.name("reg_email__")).sendKeys("test@email.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Password@123");
		WebElement dateElement = driver.findElement(By.id("day"));
		Select date=new Select(dateElement);
		date.selectByIndex(26);
		WebElement monthElement = driver.findElement(By.id("month"));
		Select month=new Select(monthElement);
		month.selectByValue("3");
		WebElement yearElement = driver.findElement(By.id("year"));
		Select year=new Select(yearElement);
		year.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label [contains(text(),Female)]")).click();
		//driver.close();

	}

}
