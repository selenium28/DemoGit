package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenShot {
	WebDriver driver;
	
	@Test
	public void screen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Jar-Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
		driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			ScreenShott.capture(driver, result.getName());
		}
		
//		driver.quit();
		
	}

}
