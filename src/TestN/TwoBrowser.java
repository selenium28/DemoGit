package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TwoBrowser {
	WebDriver driver;
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		WebElement r= driver.findElement(By.xpath("//select[@class='custom-select']"));
		r.isSelected();
		r.sendKeys("italy");
		System.out.println("Ajay 3 ");
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9847472983");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dfssju2378@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("122334");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("patil.lane behind croma showroom infront shri hotel, near college Rd,nashik");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		System.out.println("submit all ");
		System.out.println("Ajay 2");
	}

	@AfterMethod
	public void afterMethod() {
		 driver.findElement(By.xpath("//label[@for='1year']")).click();
		    driver.findElement(By.xpath("//label[@for='selenium']")).click();
		System.out.println("ajay 4");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser is launched");
		System.out.println("Ajay 1");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	System.out.println("Ajay 5");
	}

}
