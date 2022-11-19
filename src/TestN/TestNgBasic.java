package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNgBasic {
	WebDriver driver;
  @Test 
  public void Login() {
	  WebElement Username = driver.findElement(By.name("username"));
	  Username.sendKeys("Admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin123");
	  WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	  loginbutton.click();
	  
  }
   @Test (dependsOnMethods= {"Login"})
   public void invaid() {
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("Ajay");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("Ajay123");
	  WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	  Loginbutton.click();
  }
   @Test (dependsOnMethods= {"invaid"})
   public void Browseropen() {
	   WebElement Username = driver.findElement(By.name("username"));
		  Username.sendKeys("Admin");
		  WebElement password = driver.findElement(By.name("password"));
		  password.sendKeys("admin123");
		  WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		  loginbutton.click();
	   WebElement Adde=driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]"));
	   Adde.click();
	   WebElement firstname=driver.findElement(By.name("firstName"));
	   firstname.sendKeys("Ajaypatil");
	   WebElement middlename = driver.findElement(By.name("middleName"));
	   middlename.sendKeys("sdfrg");
	   WebElement lastname = driver.findElement(By.name("lastName"));
	   lastname.sendKeys("patil");
	   WebElement id =driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	   id.clear();
	   id.sendKeys("2344");
	   WebElement savebutton = driver.findElement(By.xpath("button[type='submit']"));
	   savebutton.click();
   }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
