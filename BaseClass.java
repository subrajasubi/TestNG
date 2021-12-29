package week5.day1.testng.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	public ChromeDriver driver;
	
	public String filename;
 
  
  @Parameters({"username","password"})
  
  @BeforeMethod(alwaysRun=true)
  
  public void beforeMethod(String uName,String uPass) {
	  
	  WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(uPass);
		driver.findElement(By.className("decorativeSubmit")).click();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }
@DataProvider(name="sendData")
  
  public  String [][] sendData() throws IOException {
	  
	 return Xcel.readExcel(filename);
	  
  }

}
