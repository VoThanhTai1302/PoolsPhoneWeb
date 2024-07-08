package Function_basic_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getLocation {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void getLocation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
        WebElement edtEmail = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/button"));
        Point point = edtEmail.getLocation();
        System.out.println("Tọa độ X=" + " " + point.x + "\n" + "Tọa độ Y=" + point.y);
        driver.quit();

    }

}
