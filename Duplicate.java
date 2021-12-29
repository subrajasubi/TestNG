package week5.day1.testng.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Duplicate extends BaseClass{
	

	@BeforeTest
	
	public void setData() {
		filename = "Duplicate";
		
	}
	  
	  
  @Test(dataProvider="sendData")
  public void create(String email) throws InterruptedException {
	  
	  
	  
	  driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(email);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);	
		
		String name  = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")).getText();
		
//		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		
		System.out.println(name);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
//		String duplicate = driver.findElement(By.linkText("Duplicate Lead")).getText();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
//	    System.out.println(duplicate);
		
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String name1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		
		
		
		
		if (name.equals(name1)) {
			
		System.out.println("Text matched");
		}
		else 
		{	 
	System.out.println("Text not matched");
		}
	  
  }

}
