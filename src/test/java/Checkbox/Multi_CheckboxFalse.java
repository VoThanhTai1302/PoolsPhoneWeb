package Checkbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Multi_CheckboxFalse {
    WebDriver driver;
    String pathDriver = "C:\\sourcedriver\\chromedriver.exe";

    @Test
    public void Multi_Checkbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/vyvys/OneDrive/Desktop/New%20folder%20(3)/index.html");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        List<WebElement> list = driver.findElements(By.xpath("/html/body/form"));
        WebElement title = driver.findElement(By.xpath("/html/body/form/div"));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).click();
            for (WebElement element : list) {
                if (element.isSelected() == true) {
                    element.click();

                }

            }

        }
        Thread.sleep(2000);
    }
}
