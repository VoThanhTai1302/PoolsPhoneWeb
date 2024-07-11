package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {

    WebDriver driver;
    String pathDriver = "c:\\sourcedriver\\chromedriver.exe";
    @Test
    public void SoftAssert() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.poolsmobility.com/sign-in/");

        org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
        WebElement title = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]"));
        String actualy = title.getText();

        String expected = "SignIn";
        System.out.println("Checking for the first tittle");
        softAssert.assertEquals(actualy, expected);

        System.out.println("Checking for the second tittle");
        softAssert.assertEquals(expected, "Sign IN");
        softAssert.assertAll();

    }
}
