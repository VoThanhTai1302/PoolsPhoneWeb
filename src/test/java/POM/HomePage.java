package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
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

    private By scrVideoPhone = By.xpath("//*[@id=\"own-the-future\"]");
    private By scl1 = By.xpath("//*[@id=\"layout-wrap\"]/div[1]/div/main/section[2]/div[1]");

    //Khởi tạo class và truyền driver vào thành phần
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSignInPageTitle() {
        String pageTitle = driver.getTitle();
        return pageTitle;
    }


    public boolean moveToElementHeader() throws InterruptedException {
        //Khởi tạo và click Logo để refresh page
        WebElement clicklogo = driver.findElement(logo);
        clicklogo.click();

        //Khởi tạo element Shop
        WebElement movetoShop = driver.findElement(Shop);
        WebElement movetoPoolsPhone = driver.findElement(PoolsPhone);
        WebElement movetoWhitePhonePouch = driver.findElement(WhitePhonePouch);
        WebElement movetoBlackPhonePouch = driver.findElement(BlackPhonePouch);
        WebElement movetoAdapter = driver.findElement(Adapter);
        WebElement movetoCable = driver.findElement(Cable);
        WebElement movetoPhonecase = driver.findElement(Phonecase);

        //Khai báo Actions và thực hiện hành động moveto
        Actions actions = new Actions(driver);
        actions.moveToElement(movetoShop).build().perform();
        actions.moveToElement(movetoPoolsPhone).build().perform();
        actions.moveToElement(movetoWhitePhonePouch).build().perform();
        actions.moveToElement(movetoBlackPhonePouch).build().perform();
        actions.moveToElement(movetoAdapter).build().perform();
        actions.moveToElement(movetoCable).build().perform();
        actions.moveToElement(movetoPhonecase).build().perform();

        //Khởi tạo element Features, Licenses, Whitepaper, Support thực hiện moveto
        WebElement movetoFeatures = driver.findElement(Features);
        actions.moveToElement(movetoFeatures).build().perform();
        WebElement movetoLicenses = driver.findElement(Licenses);
        actions.moveToElement(movetoLicenses).build().perform();
        WebElement movetoWhitepaper = driver.findElement(Whitepaper);
        actions.moveToElement(movetoWhitepaper).build().perform();
        WebElement movetoSupport = driver.findElement(Support);
        actions.moveToElement(movetoSupport).build().perform();

        //Khởi tạo element Ngôn ngữ và thực hiện moveto + click
        WebElement languageDisplay = driver.findElement(LanguageDisplay);
        actions.moveToElement(languageDisplay).click().build().perform();
        WebElement movetoLanguageEN = driver.findElement(LanguageEN);
        actions.moveToElement(movetoLanguageEN).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(languageDisplay).click().build().perform();
        WebElement movetoLanguageKO = driver.findElement(LanguageKO);
        actions.moveToElement(movetoLanguageKO).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(languageDisplay).click().build().perform();
        WebElement movetoLanguageVI = driver.findElement(LanguageVI);
        actions.moveToElement(movetoLanguageVI).click().build().perform();
        Thread.sleep(2000);

        //Khai báo element và moveto button Agent
        WebElement elementAgent = driver.findElement(btnBeASaleAgent);
        actions.moveToElement(elementAgent).build().perform();
        Thread.sleep(1000);
        //Khai báo element và moveto button Agent
        WebElement elementSignIn = driver.findElement(btnSignIn);
        actions.moveToElement(elementSignIn).build().perform();
        Thread.sleep(1000);

        return false;
    }


    public void clickShop() {
        WebElement clickShop = driver.findElement(Shop);
        clickShop.click();
    }

    public void clickPoolsPhone() throws InterruptedException {
        WebElement clickShop = driver.findElement(Shop);
        clickShop.click();
        WebElement movetoPoolsPhone = driver.findElement(PoolsPhone);
        WebElement movetoWhitePhonePouch = driver.findElement(WhitePhonePouch);
        WebElement movetoBlackPhonePouch = driver.findElement(BlackPhonePouch);
        WebElement movetoAdapter = driver.findElement(Adapter);
        WebElement movetoCable = driver.findElement(Cable);
        WebElement movetoPhonecase = driver.findElement(Phonecase);

        Actions actionsPoolsPhone = new Actions(driver);
        actionsPoolsPhone.moveToElement(movetoPoolsPhone).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);
        actionsPoolsPhone.moveToElement(movetoWhitePhonePouch).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);
        actionsPoolsPhone.moveToElement(movetoBlackPhonePouch).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);
        actionsPoolsPhone.moveToElement(movetoAdapter).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);
        actionsPoolsPhone.moveToElement(movetoCable).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);
        actionsPoolsPhone.moveToElement(movetoPhonecase).build().perform();
        actionsPoolsPhone.click();
        Thread.sleep(1000);

    }

//    public void clickWhitePhonePouch() {
//        WebElement clickShop = driver.findElement(WhitePhonePouch);
//        WebElement movetoPoolsPhone = driver.findElement(WhitePhonePouch);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(movetoPoolsPhone).build().perform();
//        clickShop.click();
//    }
//
//    public void clickBlackPhonePouch() {
//        WebElement clickShop = driver.findElement(BlackPhonePouch);
//        WebElement movetoPoolsPhone = driver.findElement(BlackPhonePouch);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(movetoPoolsPhone).build().perform();
//        clickShop.click();
//    }
//
//    public void clickAdapter() {
//        WebElement clickShop = driver.findElement(Adapter);
//        WebElement movetoPoolsPhone = driver.findElement(Adapter);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(movetoPoolsPhone).build().perform();
//        clickShop.click();
//    }
//
//    public void clickCable() {
//        WebElement clickShop = driver.findElement(Cable);
//        WebElement movetoPoolsPhone = driver.findElement(Cable);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(movetoPoolsPhone).build().perform();
//        clickShop.click();
//    }
//
//    public void clickPhonecase() {
//        WebElement clickShop = driver.findElement(Phonecase);
//        WebElement movetoPoolsPhone = driver.findElement(Phonecase);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(movetoPoolsPhone).build().perform();
//        clickShop.click();
//    }


    public Boolean verifySignInPageText() {
        WebElement element = driver.findElement(btnSignIn);
        String pageText = element.getText();
        String expectedPageText = "Sign In";
        return pageText.contains(expectedPageText);
    }

    public void scrollingElement(){
//        WebElement elementScrolling = driver.findElement();
    }

}
