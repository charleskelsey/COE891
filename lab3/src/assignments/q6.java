package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class q6 {
	@Test (priority = 1)
	public void executeSessionOne() {
		// First session of WebDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
		driver.quit(); // Close session after execution
		System.out.println("Driver 1");
	}
	
	@Test (priority = 2)
	public void executeSessionTwo() {
		// Second session of WebDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 2");
		driver.quit(); // Close session after execution
		System.out.println("Driver 2");
	}
	
	@Test (priority = 3)
	public void executeSessionThree() {
		// Third session of WebDriver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("Driver 3");
		driver.quit(); // Close session after execution
		System.out.println("Driver 3");
	}
}
