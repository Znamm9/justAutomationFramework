package AlyonaBoychuk.Test;

import AlyonaBoychuk.Page.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Epicenter extends TestInit {
    @Test
    public void search(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://epicentrk.ua/");
        homePage.getStringSearch().sendKeys("ваза" + "\n");
        homePage.getLinkVase().click();
        Assert.assertTrue(homePage.getButtonPay());

    }

}