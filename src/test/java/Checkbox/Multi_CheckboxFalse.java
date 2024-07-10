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
    public void Multi_Checkbox() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/vyvys/OneDrive/Desktop/New%20folder%20(3)/index.html");

        List<WebElement> list = driver.findElements(By.name("/html/body/form/div/div[1]"));
        int i = 0;
        for(WebElement element:list)
        {
            if(element.isSelected() == false)
            {
                element.click();
                System.out.println("Multi check" + element.getText());
                i++;
            }
        }
    }
}
