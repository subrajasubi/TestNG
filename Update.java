package week5.day1.testng.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Update extends BaseClassServiceTest{
	@Test
	public void update() throws InterruptedException {
		
		driver.switchTo().frame("gsft_main"); 
		WebElement se = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select se1 = new Select(se);
		se1.selectByVisibleText("Number");
		WebElement se2 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		se2.sendKeys(" INC0010104");
		se2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//label[@class='checkbox-label'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-menu col-menu list_header_context list-column-icon'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Update Selected']")).click();
		WebElement urgency = driver.findElement(By.id("incident.urgency"));
		Select u = new Select(urgency);
		u.selectByIndex(1);
		WebElement state = driver.findElement(By.id("incident.state"));
		Select s = new Select(state);
		s.selectByVisibleText("In Progress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Multiple update complete, total records updated: 1']")).getText());
		System.out.println(driver.findElement(By.xpath("//b[text()='Number >=  INC0010104']")).getText());
		
		
		
	}

}
