package Handle_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Tinh {
    WebDriver driver;

    @Test
    public void Dropdown_Tinh() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\sourcedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/vyvys/OneDrive/Desktop/New%20folder%20(2)/index.html");

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        Select select = new Select(driver.findElement(By.id("cars")));

        select.selectByVisibleText("Audi");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click", select);
        Thread.sleep(2500);
        driver.quit();
    }
}
