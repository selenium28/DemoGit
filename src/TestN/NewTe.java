package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTe {
	WebDriver driver;
  @Test
  public void login() {
	  WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	  name.sendKeys("Abhi Lande");
	  WebElement mob=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	  mob.sendKeys("92473845");
	  WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	  email.sendKeys("jlrjdf@gmail.com");
	  WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	  pass.sendKeys("jhyj87");
	  WebElement address =driver.findElement(By.xpath("(//*[@class='form-control'])[5]"));
	  address.sendKeys("subash rod.431122.beed");
	  WebElement submit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	  submit.click();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Jar-Browser/chromedriver.exe");
      driver =new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("browser is launched");
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
