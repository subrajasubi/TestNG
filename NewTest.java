package week5.day1.testng.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest extends BaseClass{
	
	
	

	@BeforeTest
	
	public void setData() {
		filename = "Xcel";
		
	}
	  
	  
  @Test(dataProvider="sendData")
  public void create(String company,String uN,String fN) throws InterruptedException {
	  
	  driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(uN);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(fN);
		driver.findElement(By.name("submitButton")).click();
  }
  
  
  
 
  }
  
  

