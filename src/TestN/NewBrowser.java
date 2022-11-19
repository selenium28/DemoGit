package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewBrowser {
	WebDriver driver;
  @Test
  public void login() {
	  System.out.println("Aj 4");
  }
  @Test (dependsOnMethods = {"login"})
  public void s() {
	  System.out.println("Aj 8");
	  
  }
  @Test (dependsOnMethods = {"s"})
  public void w() {
	  System.out.println("Aj 9");
	  
  }
  @Test  (dependsOnMethods = {"w"})
  public void Z() {
	  System.out.println("Aj 10");
	  
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Jar-Browser/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  System.out.println("Ajay 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Ajay 7");
  }

}
