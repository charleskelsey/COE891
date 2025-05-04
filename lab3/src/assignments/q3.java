package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class q3 {
	WebDriver driver;
    String driverPath = "/home/student2/ckelsey/Downloads/geckodriver";

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    @Test
    public void verifyEmailFieldTagName() {
        WebElement emailField = driver.findElement(By.id("email"));
        String tagName = emailField.getTagName();
        System.out.println("Tag name of email field: " + tagName);
        Assert.assertEquals(tagName, "input", "Email field is not an input element!");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
