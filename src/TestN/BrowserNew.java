package TestN;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class BrowserNew {
	WebDriver driver;
	@Test
	public void f() {
		WebElement regi = driver.findElement(By.xpath("(//a[@class='button tiny_button button_pale regular_text'])[7]"));
		regi.click();
		WebElement customerlogin = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]"));
		customerlogin.click();
		WebElement yourname = driver.findElement(By.name("yourname"));
		Select Selectyouname=new Select(yourname);
		Selectyouname.selectByVisibleText("Hermoine Granger");
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		login.click();
		WebElement withdrow = driver.findElement(By.cssSelector("button[ng-class='btnClass3']"));
		withdrow.click();
		WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
		amount.sendKeys("98477447");
		WebElement Withdro = driver.findElement(By.xpath("//button[@type='submit']"));
		Withdro.click();
		System.out.println("Browser is open");


	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularjs-protractor-practice-site/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
