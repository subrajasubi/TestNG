package week5.day1.testng.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewServiceClassTest extends BaseClassServiceTest{
  @Test
  public void service() throws IOException, InterruptedException {
	  
	  driver.switchTo().frame("gsft_main");
	  
	  driver.findElement(By.xpath("//button[text()='New']")).click();
	  
	System.out.println("Incident Number : " +driver.findElement(By.id("incident.number")).getAttribute("Value"));
	  
	  driver.findElement(By.xpath("//button[@data-original-title='Lookup using list']")).click();
	  
	  Set<String> windowHandles = driver.getWindowHandles();
		
	  List<String>handles = new ArrayList<String>(windowHandles);
		
	  driver.switchTo().window(handles.get(1));
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody[1]/tr[1]/td[3]/a[1]")).click();
	  
	  driver.switchTo().window(handles.get(0));
	  
	  driver.switchTo().frame("gsft_main");
	  
	   driver.findElement(By.xpath("(//input[@mandatory='true'])[2]")).sendKeys("Good Tutor");
	   
	   driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	   
	   
	  
	 
	  
	
			
			
		
  }	  
	  

}
	        	
	        
	        
	        
	        
















	  














