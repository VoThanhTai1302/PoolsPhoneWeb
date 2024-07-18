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
        WebElement Shop = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/a"));
        WebElement PoolsPhone = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[1]/a"));
        WebElement WhitePhonePouch = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[2]/a"));
        WebElement BlackPhonePouch = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[3]/a"));
        WebElement Adapter = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[4]/a"));
        WebElement Cable = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[5]/a"));
        WebElement Phonecase = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[6]/a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(Shop).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(PoolsPhone).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(WhitePhonePouch).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(BlackPhonePouch).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(Adapter).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(Cable).build().perform();
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(Phonecase).build().perform();
        actions.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
