import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

    WebDriver driver;
    String pathDriver = "c:\\sourcedriver\\chromedriver.exe";


    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");

        Thread.sleep(1000);
    }
}
