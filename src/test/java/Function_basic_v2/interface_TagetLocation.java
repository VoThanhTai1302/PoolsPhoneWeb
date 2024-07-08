package Function_basic_v2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class interface_TagetLocation {

    WebDriver driver;

    @Test
    public void interface_TagetLocation(){
        System.setProperty("webdriver.chrome.driver","c:\\sourcedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        //Handle alert
        driver.switchTo().alert();

        driver.switchTo().frame(1);
        driver.switchTo().frame("");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"layout-wrap\"]/div[1]/div/main/section[1]/div/div[1]"));
        driver.switchTo().frame(element);

        //Điều hướng sang khung hiển thị trên trình duyệt hiện tại
        driver.switchTo().defaultContent();
    }
}
