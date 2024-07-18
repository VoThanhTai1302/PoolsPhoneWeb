package POM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeTest extends BaseSetup{
    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void setup(){
        driver = getDriver();
    }
    @Test
    public void homepage() throws InterruptedException {
        System.out.println(driver);
        homePage = new HomePage(driver);
        Assert.assertTrue(homePage.verifySignInPageText(),"Homepage");
        Assert.assertTrue(homePage.moveToElementHeader(),"Moveto Header");
        homePage.moveToElementHeader();
    }

}
