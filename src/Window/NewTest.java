package Window;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Test
	public void window() {
		System.setProperty("webdriver.chrome.driver", "Jar-Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement click = driver.findElement(By.linkText("Click Here"));
		click.click();


		String mainwindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		System.out.println("MainWindow id:"+mainwindow);

		while (it.hasNext()) {
			String childwindow=it.next();

			if (!mainwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				
				WebElement emailId=driver.findElement(By.name("emailid"));
				emailId.sendKeys("Ajay@37gmail.com");
				
				WebElement submit = driver.findElement(By.xpath("//*[@name='btnLogin']"));
				submit.click();

				driver.switchTo().window(mainwindow);
				System.out.println("Switched to parent window");
				click.isDisplayed();
				driver.quit();
			}
		}
	}
}
