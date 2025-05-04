package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class q2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "/home/student2/ckelsey/Downloads/geckodriver";
	public WebDriver driver ;
	
	@Test
	public void verifyHomepageTitle() {
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
        System.out.println(expectedTitle.equals(actualTitle));
		driver.close(); 
	}
}
