package Function_basic_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getIsDisplayed {

    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";
    @Test
    public void isDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
       WebElement checkRemember =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[5]/div[1]/input"));
        boolean status = checkRemember.isDisplayed();
        System.out.println("Trạng thái hiện tại: " +status);
//        Show trạng thái True nếu phần tử có hiển thị và ngược lại show trạng thái False nếu trạng thái không hiển thị
        Thread.sleep(1000);
        driver.quit();
    }
}
