package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingElement {
    private WebDriver driver;

    @Test
    public void scrollingElement() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\sourcedriver\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to a web page
        driver.get("https://dev.poolsmobility.com/");
        // Find the element you want to scroll to
        WebElement element = driver.findElement(By.xpath("//*[@id=\"layout-wrap\"]/div[1]/div/main/section[4]/div/div"));

        // Use JavascriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Optionally, add a pause to see the result (not recommended for production)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        // Close the browser
        driver.quit();
    }
}
