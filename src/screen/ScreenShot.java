package screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) { 
		//set the location of chrome browser
        System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://demoqa.com");
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //Copy the file to a location and use try catch block to handle exception
        try {
        	FileHandler.copy(screenshot, new File("Screenshot/homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //closing the webdriver
        driver.close();
    }


}
