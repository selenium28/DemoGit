package ParameterTestNG;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s,String p) {
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
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
	  Object[][]data=new Object[5][3];
	  data[0][0]="Ajay";
	  data[0][1]="968438943";
	  data[0][2]="ajay79@gmail.com";
	  
	  data[1][0]="Dev";
	  data[1][1]="123";
	  data[1][2]="98565667";
	  
	  data[2][0]="Amol";
	  data[2][1]="567";
	  data[2][2]="abhsuu nread.bliud.374.pune";
	  
	  data[3][0]="Dev";
	  data[3][1]="123";
	  data[3][2]="98565667";
	  
	  data[4][0]="Amol";
	  data[4][1]="567";
	  data[4][2]="abhsuu nread.bliud.374.pune";
	  
	  
	return data;
   
    };
  }

