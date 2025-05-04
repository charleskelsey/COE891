package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class q5p2 {
	WebDriver driver;
    String driverPath = "/home/student2/ckelsey/Downloads/geckodriver";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Browser opened.");
    }

    @Test
    public void launchGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google launched.");
    }

    @Test(dependsOnMethods = "launchGoogle")
    public void performSearchAndClickFirstLink() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Facebook");
        searchBox.submit();

        // Provide Google enough time to load (as you requested)
        Thread.sleep(25000);

        // Find and click the first result link
        WebElement firstResultLink = driver.findElement(By.xpath("(//div[@id='search']//a)[1]"));
        firstResultLink.click();
        System.out.println("Performed search and clicked first link.");
        
        // Let Facebook page load after click
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = "performSearchAndClickFirstLink")
    public void verifyFacebookPageTitle() {
        String title = driver.getTitle();
        System.out.println("Current page title: " + title);
        Assert.assertTrue(title.contains("Facebook"),
                "Expected title to contain 'Facebook' but got: " + title);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
        System.out.println("Browser closed.");
    }

}
