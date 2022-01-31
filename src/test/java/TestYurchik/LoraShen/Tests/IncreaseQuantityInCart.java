package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.CartPageLoraShen;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncreaseQuantityInCart extends TestInit {
    LandingPageLoraShen landingPageLoraShen;
    TroyandiPageLoraShen troyandiPageLoraShen;
    CartPageLoraShen cartPageLoraShen;
    @Test
    public void CheckQuantityIncrease() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        cartPageLoraShen = new CartPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.troyandiZakaz().click();
        cartPageLoraShen.cartIncreaseQuantityOfFirstElement().click();
        driver.navigate().refresh();
        Assert.assertTrue(cartPageLoraShen.checkQuantityTwo().size() > 0);
    }
}
