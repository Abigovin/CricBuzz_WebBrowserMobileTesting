package WebBrowser;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricBuzz extends capability{

	public static void main(String[] args) throws Exception  {
		
		AndroidDriver<AndroidElement> driver = desiredCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Cricbuzz");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Cricbuzz']")).click();
		driver.findElement(By.xpath("//span[text()='Menu ']")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//span[text()='England clinch series 1-0']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Successfully Scrolled down to webelement ");
	}

}
