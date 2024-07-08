package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class locator_List {

    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void getListLocator() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        List<WebElement> list = driver.findElements(By.tagName("div"));
        int i = 0;
        for (WebElement element : list) {
            System.out.println("Danh sách locator của thẻ p: " + element.getText());
            i++;
        }
        Thread.sleep(1000);
        driver.quit();

    }
}
