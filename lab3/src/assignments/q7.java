package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class q7 {
	WebDriver driver;
    String driverPath = "/home/student2/ckelsey/Downloads/geckodriver";
    String baseUrl = "https://www.linkedin.com/login";

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void loginAndVerify() throws InterruptedException {
        // Get credentials from environment variables (secure handling)
        String username = System.getenv("LINKEDIN_USERNAME");
        String password = System.getenv("LINKEDIN_PASSWORD");

        if (username == null || password == null) {
            throw new IllegalStateException("Environment variables LINKEDIN_USERNAME and LINKEDIN_PASSWORD must be set.");
        }

        // Locate fields and fill login credentials
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        // Wait for the feed page to load (adjust if needed for slower network)
        Thread.sleep(25000);  // 10 seconds to allow redirect (adjust as needed)

        // Verify URL after login
        String expectedUrl = "https://www.linkedin.com/feed/";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current URL after login: " + actualUrl);

        if (actualUrl.startsWith(expectedUrl)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }

        // Assert for automatic TestNG pass/fail
        Assert.assertTrue(actualUrl.startsWith(expectedUrl), "Login failed ? URL does not match expected feed URL.");
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
