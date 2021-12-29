package week5.day1.testng.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assign extends BaseClassServiceTest{
	
	@Test
	public void assign() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
		driver.switchTo().frame("gsft_main"); 
		WebElement se2 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		se2.sendKeys(" INC0010104");
		se2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//label[@class='checkbox-label'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-menu col-menu list_header_context list-column-icon'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Update Selected']")).click();
		driver.findElement(By.id("lookup.incident.assignment_group")).click();
		 Set<String> windowHandles = driver.getWindowHandles();	
		  List<String>handles = new ArrayList<String>(windowHandles);		
		  driver.switchTo().window(handles.get(1));
		  WebElement soft = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		  soft.sendKeys("software");
		  soft.sendKeys(Keys.ENTER);
		  driver.findElement(By.linkText("Software")).click();
		  Thread.sleep(2000);
		  driver.switchTo().window(handles.get(0));
		  driver.switchTo().frame("gsft_main"); 
		  driver.findElement(By.xpath("(//textarea[@class='form-control'])[3]")).sendKeys("Easy learning");
		  driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
		 

	}

}
