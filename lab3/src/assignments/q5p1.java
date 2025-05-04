package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class q5p1 {
	WebDriver driver;

    @Test(priority = 1)
    public void openBrowser() {
        System.setProperty("webdriver.gecko.driver", "/home/student2/ckelsey/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        System.out.println("Browser opened.");
    }

    @Test(priority = 2)
    public void launchGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google launched.");
    }

    @Test(priority = 3)
    public void performSearchAndClickFirstLink() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Facebook");
        searchBox.submit();
        Thread.sleep(25000);
        WebElement firstResultLink = driver.findElement(By.xpath("(//div[@id='search']//a)[1]"));
        firstResultLink.click();
        Thread.sleep(5000);
        System.out.println("Performed search and clicked first link.");
    }

    @Test(priority = 4)
    public void verifyFacebookPageTitle() {
        String title = driver.getTitle();
        System.out.println("Current page title: " + title);
        Assert.assertTrue(title.contains("Facebook"), 
            "Expected 'Facebook' in the page title but got: " + title);
    }

    @Test(priority = 5)
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed.");
    }
}
