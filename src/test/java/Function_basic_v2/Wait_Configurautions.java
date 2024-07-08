package Function_basic_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wait_Configurautions {
    WebDriver driver;

    @Test
    public void Wait_Configurautions(){
        System.setProperty("webdriver.chrome.driver","c:\\sourcedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");

        //Thiết lập đợi ngầm trong 10s đổi lại
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Thiết lập thời gian load page xong mới thao tác trong 10s
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    }
}
