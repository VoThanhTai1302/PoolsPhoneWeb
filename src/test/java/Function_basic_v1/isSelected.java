package Function_basic_v1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isSelected {
    WebDriver driver;
    String driverPath = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void isSelected() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]")).click();
        WebElement checkRemember = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[5]/div[1]/input"));
        boolean statusEnble = checkRemember.isEnabled();
        if(statusEnble)
        {
            checkRemember.click();
        }
        else{
            System.out.println("Trạng thái chưa được bật");
        }
        boolean statusIselected = checkRemember.isSelected();
        if (statusIselected)
        {
            System.out.println("Trạng thái bấm chọn= " + statusIselected);
        }else {
            System.out.println("Trạng thái không bấm chọn= " + statusIselected);
        }
//        Show trạng thái True nếu phần tử có được chọn và ngược lại show trạng thái False nếu trạng thái chưa được chọn
        Thread.sleep(2000);
        driver.quit();
    }
}