package TestYurchik.LoraShen.Tests;

import ClasesToAllUs.TestInit;
import TestYurchik.LoraShen.Pages.CartPageLoraShen;
import TestYurchik.LoraShen.Pages.LandingPageLoraShen;
import TestYurchik.LoraShen.Pages.TroyandiPageLoraShen;
import org.testng.annotations.Test;

public class CheckNoNameOrderCart extends TestInit {
    TroyandiPageLoraShen troyandiPageLoraShen;
    LandingPageLoraShen landingPageLoraShen;
    CartPageLoraShen cartPageLoraShen;
    @Test
    public void checkNoNameOrder() {
        troyandiPageLoraShen = new TroyandiPageLoraShen(driver);
        landingPageLoraShen = new LandingPageLoraShen(driver);
        cartPageLoraShen = new CartPageLoraShen(driver);
        driver.get("https://lorashen.ua/shop");
        landingPageLoraShen.floristiks().click();
        landingPageLoraShen.floraTroyandi().click();
        troyandiPageLoraShen.troyandiZakaz().click();
        cartPageLoraShen.cartNameLine().sendKeys("Flex");
        cartPageLoraShen.cartEmailLine().sendKeys("shopogolik@gmail.com");
        cartPageLoraShen.cartMobilePhone().sendKeys("+380323232323");
        cartPageLoraShen.cartPhoneOfDelivered().sendKeys("+380323232323");
        cartPageLoraShen.cartSelectTime().click();
        cartPageLoraShen.cartSelectAdress().click();
        cartPageLoraShen.cartCompleteOrder().click();
    }
}
