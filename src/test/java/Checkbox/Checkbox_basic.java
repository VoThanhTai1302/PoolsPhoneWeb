package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox_basic {
    WebDriver driver;
    String pathDriver = "C:\\sourcedriver\\chromedriver.exe";
    @Test
    public void Checkbox_basic(){
        System.setProperty("webdriver.chrome.driver",pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/sign-in");
        WebElement ckkRemember  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[5]/div[1]/input"));
        Boolean checkbox = ckkRemember.isSelected();

        if(checkbox == false){
            ckkRemember.click();
        }else{
            System.out.println("Chua hien thi");
        }


    }
}
