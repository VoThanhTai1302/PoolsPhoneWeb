package Actions;

import Browsers.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsClass {
    WebDriver driver;
    String pathDriver = "c:\\sourcedriver\\chromedriver.exe";

    @Test //Action là sự kiện hành động thao tác của chuột và bàn phím
    public void ActionsClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://dev.poolsmobility.com/");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[1]"));

        Actions actions = new Actions(driver);
        actions.contextClick(element).build().perform();
        Thread.sleep(2000);
        driver.quit();

    }
}
