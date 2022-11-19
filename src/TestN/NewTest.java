package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  WebDriver driver;
	
	
  @Test (priority=1)
  public void login() {
	  WebElement username = driver.findElement(By.name("username")); 
		username.sendKeys("Ajay");
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); 
		loginButton.click();
		System.out.println("1: Login successful");
  }
  @Test (priority=2)
  public void loging() {
	  WebElement username =driver.findElement(By.className("username"));
	  username.sendKeys("Admin");
	  WebElement password=driver.findElement(By.className("password"));
	  password.sendKeys("admin123");
	  WebElement LoginButton=driver.findElement(By.name("//button[@type='submit']"));
	  LoginButton.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
