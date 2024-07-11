package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClass extends BrowserSetup {
    WebDriver driver;
    String pathDriver = "c:\\sourcedriver\\chromedriver.exe";

    public void ActionsClass(){
        System.setProperty("webdriver.chrome.driver",pathDriver);
        driver = new ChromeDriver();

    }
}
