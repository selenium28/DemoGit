package test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShott {

	public static void capture(WebDriver driver, String screenShotName) {
		try{
			// To create reference of TakesScreenshot
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			// Call method to capture screenshot
			File src=screenshot.getScreenshotAs(OutputType.FILE);
			// Copy files to specific location 
			// result.getName() will return name of test case so that screenshot name will be same as test case name
			FileHandler.copy(src, new File("ScreenShotss/"+screenShotName+".png"));
			System.out.println("Successfully captured a screenshot");
		}catch (Exception e){
			System.out.println("Exception while taking screenshot "+e.getMessage());
		} 

	}

}
