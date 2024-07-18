package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ScrollingBasic {
    private WebDriver driver;
    private String driverPath = "c:\\sourcedriver\\chromedriver.exe";

    @Test
    public void ScrollingBasic() {

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://dev.poolsmobility.com/");

        //Lấy giá trị chiều cao của trang
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long pageHeight = (long) js.executeScript("return document.body.scrollHeight");
        //Điều chỉnh tốc độ scrolling theo milliseconds
        int scrollingSpeed = 100;

        //Điều chỉnh số lần scrolling theo px
        int scrollingStep = 10;

        //Hiệu suất scrolling sử dụng vòng lặp for
        for (int i = 0; i < pageHeight; i += scrollingStep) {
            js.executeScript("window.scrollBy(0, arguments[0]);", scrollingStep);
            try {
                Thread.sleep(scrollingSpeed);
            } catch (Exception e) {
                System.out.println("Error..." + e);
            }

            //Thời gian chờ xem kết quả

        }
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}