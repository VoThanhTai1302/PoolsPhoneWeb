package ScreenShot;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class TakeScreenShot {

    private WebDriver driver;
    private String driverPath = "c:\\sourcedriver\\chromedriver.exe";

    @Test
    public void homePage() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");

        //Call take screenshot function
        this.takeSnapshot(driver, "C:\\Users\\vyvys\\AutomationProject\\Tutorial\\PoolsPhone_Web\\Screenshot\\HeroBanner");
        Thread.sleep(2000);
        this.takeSnapshot(driver, "C:\\Users\\vyvys\\AutomationProject\\Tutorial\\PoolsPhone_Web\\Screenshot\\1");
        this.takeFullScreenShot(driver, "C:\\Users\\vyvys\\AutomationProject\\Tutorial\\PoolsPhone_Web\\Screenshot\\fullscreenshot");
        this.takeScreenShotElement(driver, "C:\\Users\\vyvys\\AutomationProject\\Tutorial\\PoolsPhone_Web\\Screenshot\\fullscreenshotElement");
    }

    public static void takeSnapshot(WebDriver webDriver, String fileWithPath) throws IOException {
        // Convert driver to TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) webDriver;

        // Call getScreenshot to create image file
        File file = screenshot.getScreenshotAs(OutputType.FILE);

        // Move image file to new destination
        File desfile = new File(fileWithPath);

        // Copy file at destination
        FileUtils.copyFile(file, desfile);
    }

    //Chụp từng đoạn rồi ghép lại thành 1 màn hình full
    //Đang bị lỗi vì có khoảng trống giữa các đoạn hình ảnh
    public static void takeFullScreenShot(WebDriver driver, String fileWithPath) throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "jpg", new File(fileWithPath));
    }


    //Screenshot theo element
    public static void takeScreenShotElement(WebDriver driver, String fileWithPath) throws IOException {
        //Find element
        WebElement element = driver.findElement(By.xpath("//*[@id=\"layout-wrap\"]/div[1]/div/main/div[3]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver, element);
        ImageIO.write(screenshot.getImage(), "jpg", new File(fileWithPath));
    }
}
