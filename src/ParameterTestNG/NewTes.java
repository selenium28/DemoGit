package ParameterTestNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class NewTes {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s,String p,String k) {
	  System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  WebElement username = driver.findElement(By.xpath("//*[@placeholder='Enter your name']"));
	  username.sendKeys(n);
	  WebElement mobile = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	  mobile.sendKeys(s);
	  WebElement email = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
	  email.sendKeys(p);
	  WebElement password=driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
	  password.sendKeys(s);
	  WebElement address=driver.findElement(By.xpath("//*[@id='address']"));
	  address.sendKeys(n);
	  WebElement click = driver.findElement(By.name("submit"));
	  click.click();
	  
	  WebElement male = driver.findElement(By.name("optionsRadios"));
	  male.click();
	  WebElement day = driver.findElement(By.xpath("(//*[@class='form-check-input'])[4]"));
	  day.click();
	  
	  WebElement cuntry = driver.findElement(By.name("Italy"));
	  Select Selectcuntry=new Select(cuntry);
	  Selectcuntry.selectByVisibleText("Italy");
	  
	  
	  WebElement year =driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
	  year.click();
	  WebElement selenium=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
	  selenium.click();
  }

  @DataProvider
  public Object[][] dp() {
	  Object[][]data=new Object[3][4];
	  data[0][0]="Ajay";
	  data[0][1]="968438943";
	  data[0][2]="ajay79@gmail.com";
	  data[0][3]="Italy";
	  
	  data[0][0]="jay";
	  data[0][1]="9438943";
	  data[0][2]="jay79@gmail.com";
	  data[0][3]="Italy";
	  
	  data[0][0]="Aj";
	  data[0][1]="98943";
	  data[0][2]="aj79@gmail.com";
	  data[0][3]="Italy";
	  
	  
	return data;
  }
}
