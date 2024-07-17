package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private By logo = By.xpath("//*[@id=\"header\"]/div/div[1]/a/img");
    private By Shop = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/a");
    private By PoolsPhone = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[1]/a");
    private By WhitePhonePouch = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[2]/a");
    private By BlackPhonePouch = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[3]/a");
    private By Adapter = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[4]/a");
    private By Cable = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[5]/a");
    private By Phonecase = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[1]/ul/li[6]/a");
    private By Features = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[2]/a");
    private By Licenses = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[3]/a");
    private By Whitepaper = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[4]/a");
    private By Support = By.xpath("//*[@id=\"header\"]/div/div[2]/div[1]/ul/li[5]/a");
    private By LanguageDisplay = By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[1]");
    private By LanguageEN = By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[2]/div[1]");
    private By LanguageKO = By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[2]/div[2]");
    private By LanguageVI = By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[2]/div[3]");
    private By btnBeASaleAgent = By.xpath("//*[@id=\"header\"]/div/div[2]/button[1]");
    private By btnSignIn = By.xpath("//*[@id=\"header\"]/div/div[2]/button[2]");
    private By btnExploreMore = By.xpath("//*[@id=\"layout-wrap\"]/div[1]/div/main/div[3]/div[1]/button");

    //Khởi tạo class và truyền driver vào thành phần
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSignInPageTitle(){
        String pageTitle = driver.getTitle();
        return pageTitle;
    }

    public Boolean verifySignInPageTitle(){
        String expectedTitle = "Sign In";
        return getSignInPageTitle().equals(expectedTitle);
    }


}
