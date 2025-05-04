package assignments;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class q4 {
	WebDriver driver;
    String driverPath = "/home/student2/ckelsey/Downloads/geckodriver";
    String url = "https://lambdatest.github.io/sample-todo-app/";

    @BeforeTest
    public void setup() {
        System.out.println("Setting up WebDriver...");
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println("Navigated to URL: " + url);
    }
    
    @Test
    public void completeTodoListTest() {
        // Check "Second Item"
        System.out.println("Attempting to find and check Second Item...");
        WebElement secondItem = driver.findElement(By.name("li2"));
        secondItem.click();
        System.out.println("Second Item clicked.");
        Assert.assertTrue(secondItem.isSelected(), "Second item should be checked!");
        System.out.println("Second Item verification complete.");
        
        // Check "Fourth Item"
        System.out.println("Attempting to find and check Fourth Item...");
        WebElement fourthItem = driver.findElement(By.name("li4"));
        fourthItem.click();
        System.out.println("Fourth Item clicked.");
        Assert.assertTrue(fourthItem.isSelected(), "Fourth item should be checked!");
        System.out.println("Fourth Item verification complete.");
        
        // Add a new item (your name) to the list
        System.out.println("Preparing to add new item...");
        WebElement inputField = driver.findElement(By.id("sampletodotext"));
        inputField.clear();
        System.out.println("Input field cleared.");
        
        String newItemText = "Charles";
        inputField.sendKeys(newItemText);
        System.out.println("Entered text: " + newItemText);
        
        WebElement addButton = driver.findElement(By.id("addbutton"));
        addButton.click();
        System.out.println("Add button clicked.");
        
        // Verify the new item was added
        System.out.println("Verifying new item was added...");
        java.util.List<WebElement> allItems = driver.findElements(By.tagName("li"));
        WebElement lastItem = allItems.get(allItems.size() - 1);
        String lastItemText = lastItem.getText();
        System.out.println("Last item in the list: " + lastItemText);
        
        Assert.assertTrue(lastItemText.contains(newItemText), "New item was not added correctly!");
        System.out.println("New item verification complete.");
    }
    
    @AfterTest
    public void teardown() {
        System.out.println("Closing WebDriver...");
        driver.quit();
        System.out.println("WebDriver closed successfully.");
    }

}
