package Function_basic_v2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class SetCodeBrowser {

    WebDriver driver;

    @Test
    public void SetCodeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\sourcedriver\\chromedriver.exe");
        driver = new FirefoxDriver();
        driver = new InternetExplorerDriver();
        driver = new EdgeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://dev.poolsmobility.com/sign-in");
        Set<String> codeBrowser = driver.getWindowHandles();
        for (String codeBrowsers : codeBrowser){
           System.out.println(driver.switchTo().window(codeBrowsers));
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
