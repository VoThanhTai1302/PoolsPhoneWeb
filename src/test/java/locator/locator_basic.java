package locator;

import Helper.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locator_basic {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";
    Setup setup;
    @Test
    public void getLocator() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/input")).sendKeys("vothanhtai@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[4]/input")).sendKeys("vothanhtai@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
