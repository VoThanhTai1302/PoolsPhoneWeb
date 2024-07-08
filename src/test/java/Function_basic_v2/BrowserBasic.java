package Function_basic_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserBasic {
    WebDriver driver;
@Test
    public void Browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\sourcedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Đi tới trang
        driver.navigate().to("https://dev.poolsmobility.com/sign-in");
        Thread.sleep(2000);
        //Điều hướng về lại trang trước đó với button Back of website
        driver.navigate().back();
        Thread.sleep(2000);
        //Làm mới trang
        driver.navigate().refresh();
        Thread.sleep(2000);
        //Điều hướng đến trang sau
        driver.navigate().forward();
        Thread.sleep(2000);

        //In ra title của trang
        String title = driver.getTitle();
        System.out.println("Title= " + title);
        Thread.sleep(2000);
        //In ra link website hiện tại
        String link = driver.getCurrentUrl();
        System.out.println("Current URL: " + link);
        //In ra source page HTML
        String sourceHTML = driver.getPageSource();
        System.out.println("Sour HTML" + sourceHTML);

    }
}
