package ParameterTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	WebDriver driver;
	
	@Parameters("browser")
  @Test
  public void Testcase(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
			driver = new FirefoxDriver();
		} 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Browser has been Launched");
		driver.manage().window().maximize();
		{
         
		}
		
  }
  
}
