package Function_basic_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class submit {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void submit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.friendify.ai/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[1]/div/div[3]/form/button")).submit();
        Thread.sleep(2000);
        driver.quit();
    }
}
