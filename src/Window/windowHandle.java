package Window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowHandle {
	WebDriver driver;
	@Test
	public void windowhand() {
		System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement clickhare = driver.findElement(By.linkText("Click Here"));
		clickhare.click();


		String mainwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		System.out.println("MainWindow id:"+mainwindow);

		while (it.hasNext()) {
			String childwindow = it.next();
			
			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				WebElement mail = driver.findElement(By.name("emailid"));
				mail.sendKeys("ajay@gmail.com");
				
				WebElement submit = driver.findElement(By.xpath("//*[@name='btnLogin']"));
				submit.click();
				
				driver.switchTo().window(mainwindow);
				System.out.println("Switched to parent window");
				clickhare.isDisplayed();
				driver.quit();
				
				
			}
		}
	}
}
