package week5.day1.testng.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DeleteService extends BaseClassServiceTest{
	
	
	@Test
	public void assign() {
		
		
		driver.switchTo().frame("gsft_main"); 
		WebElement se = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select se1 = new Select(se);
		se1.selectByVisibleText("Number");
		WebElement se2 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		se2.sendKeys(" INC0010104");
		se2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[1]")).click();
		driver.findElement(By.id("ok_button")).click();
		System.out.println(driver.findElement(By.xpath("//td[text()='No records to display']")).getText());
		
		
		
		
		
		
		
	}

}
