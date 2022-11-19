package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BrowserOpen {
	WebDriver driver;
	@Test
	public void login() {
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Mr.Ajay");
		WebElement lastname =driver.findElement(By.name("lastName"));
		lastname.sendKeys("Gundekar");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("8494984033");
		WebElement Gmail =driver.findElement(By.name("userName"));
		Gmail.sendKeys("ajayso22@gmail.com");
	}

	@Test (dependsOnMethods = {"login"})
	public void  MailingInformation() {
		WebElement Address = driver.findElement(By.name("address1"));
		Address.sendKeys("Chaus Publication 2782, Trio chambers, sadashiv.");
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Pune");
		WebElement State= driver.findElement(By.name("state"));
		State.sendKeys("Maharastra");
		WebElement pin = driver.findElement(By.name("postalCode"));
		pin.sendKeys("431122");
		WebElement Select =driver.findElement(By.name("country"));
		Select obj =new Select(Select);
		obj.selectByVisibleText("INDIA");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("MrAjay");
		WebElement password =driver.findElement(By.xpath("(//input[@maxlength='60'])[6]"));
		password.sendKeys("123455");
		WebElement pass =driver.findElement(By.xpath("(//input[@maxlength='60'])[7]"));
		pass.sendKeys("123455");
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();

	}
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser is launched");
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();

	}





}
