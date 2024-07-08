package Function_basic_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Cookie {

    WebDriver driver;

    @Test
    public void Cookie() throws InterruptedException {
        //phóng fullscreen browser
        System.setProperty("webdriver.chrome.driver", "c:\\sourcedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        //Thêm cookie mới
        org.openqa.selenium.Cookie cookie = new org.openqa.selenium.Cookie("customName", "customName");
        driver.manage().addCookie(cookie);

        //Get all data Cookie
        Set<org.openqa.selenium.Cookie> cookieSet = driver.manage().getCookies();
        System.out.println("List cookie= " + cookieSet);

        Thread.sleep(2000);
        driver.quit();
    }
}
