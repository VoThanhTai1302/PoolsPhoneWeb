package Function_basic_v1;

import Browsers.BrowserSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getClear extends BrowserSetup {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void clear() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
        WebElement edtEmail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/input"));
        edtEmail.sendKeys("vothanhtai@gmail.com");
        WebElement edtPassword = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[4]/input"));
        edtPassword.sendKeys("vothanhtai@gmail.com");
        Thread.sleep(1000);
        edtEmail.clear();
        Thread.sleep(1000);
        edtPassword.clear();
        driver.quit();

    }


}