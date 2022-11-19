package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BrowserLoached {
	WebDriver driver;
  @Test
  public void login() {
	  WebElement username = driver.findElement(By.xpath("//input[@id='name']"));
	  username.sendKeys("Ajay");
	  WebElement phone = driver.findElement(By.xpath("//input[@aria-describedby='phone']"));
	  phone.sendKeys("8373687");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  System.out.println("Browser is launched");
  }

  @AfterTest
  public void afterTest() {
  }
  

}
