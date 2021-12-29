package week5.day1.testng.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassServiceTest {
	
	
	public ChromeDriver driver;
	  
  @BeforeMethod
  
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
		
		    driver = new ChromeDriver();
			
			driver.get("https://dev69706.service-now.com/login.do?user_name=admin&sys_action=sysverb_login&user_password=IDh0dTabRV3v");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Thread.sleep(2000);
			
			driver.findElement(By.id("user_name")).sendKeys("admin");
			
			driver.findElement(By.id("user_password")).sendKeys("Iniyan@123");
			
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("incident");
			
			driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
	  
	  
  }
  
  @AfterMethod
  
  public void after() {
	  
	 // driver.close();
  }
}
