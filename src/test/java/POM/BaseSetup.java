package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseSetup {
    private WebDriver driver;
    static String driverPath = "c:\\sourcedriver\\chromedriver.exe";

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(String browserType, String appURL) {
        switch (browserType) {
            case "chrome":
                driver = initChromeDriver(appURL);
                break;
            case "firefox":
                driver = initFireDriver(appURL);
                break;
            default:
                driver = initChromeDriver(appURL);
        }
    }

    private static WebDriver initChromeDriver(String appURL) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }


    private static WebDriver initFireDriver(String appURL) {
        System.setProperty("webdriver.gecko.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeClass
    public void initTestBaseSetup(String browserType, String appURL)
    {
        try{
            setDriver(browserType,appURL);
        }catch (Exception e)
        {
            System.out.println("Error..." + e);
        }
    }
    @AfterClass
    public void teasDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
