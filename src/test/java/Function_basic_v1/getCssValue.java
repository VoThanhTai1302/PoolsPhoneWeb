package Function_basic_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getCssValue {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void getCssValue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/button"));
        String cssValue = element.getCssValue("font-size");
        System.out.println("CssValue= " + cssValue);
        driver.quit();

    }
}
