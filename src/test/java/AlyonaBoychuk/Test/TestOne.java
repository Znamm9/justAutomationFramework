package AlyonaBoychuk.Test;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.TestInit;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TestOne extends TestInit {
    @Test
    public void testCeckAboutUsLink() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clouseGoItbutton();
        homePage.clickGetTheAppLink();
        homePage.checkAboutUs();
        sleep(3);
        Assert.assertTrue(homePage.getUrlAboutUsIsDisplayed());
    }
    @Test
    public void testChtckClicSignIn() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clouseGoItbutton();
        homePage.getSignInLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));
    }

    @Test
    public void testLifeChat() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://qa2.eatstreet.com/");
        homePage.clouseGoItbutton();
        sleep(5);
        Assert.assertTrue(homePage.getLifeChat());
    }
}
