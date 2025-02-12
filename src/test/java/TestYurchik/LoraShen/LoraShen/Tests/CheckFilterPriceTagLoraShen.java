package TestYurchik.LoraShen.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckFilterPriceTagLoraShen extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;


    @Test
    public void checkFilterPriceTag() {
        landingPageLoraShen = new LandingPageLoraShen(driver);
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.filterBar().click();
        getElement("//label[@for = 'id_price_6']");
        troyandiPageLoraShen.filterPriceTag().click();
        troyandiPageLoraShen.filterAcceptButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("?price_filter=6"));
    }


}
