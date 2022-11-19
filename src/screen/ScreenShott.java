package screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShott {

	public static void main(String[] args) throws IOException {

			//set the location of chrome browser
	        System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
	        // Initialize browser
	        WebDriver driver = new ChromeDriver();
	        //navigate to url
	        driver.get("https://demoqa.com");
	       //Take the screenshot
	        
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        
	        File scr = ts.getScreenshotAs(OutputType.FILE);
	        File trg = new File("ScreenShotss/Screenshot.png");
	        FileHandler.copy(scr, trg);
	        driver.close();
	    }

}
