package RozetkaSergey;

import ClasesToAllUs.TestInit;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.*;

public class Vijar extends TestInit {


    @Test
    public void deleteFromBasket(){
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.topBar2().click();
        homePageVijar.clickOnSamorezy().click();
        homePageVijar.closeAdverb().click();
        homePageVijar.getItems().get(0).click();
        homePageVijar.closeAdverb().click();
        homePageVijar.pickBuy().get(0).click();
        homePageVijar.pickBuy2().get(0).click();
        homePageVijar.ordering().click();
        homePageVijar.deliteItemFromBasket().click();
        String value = homePageVijar.getfromseitText().getText();
        Assert.assertEquals(value,"В вашей корзине ещё нет товаров.");
        sleep(1);






    }
    @Test
    public void checkSchedule () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickOnStatusOfOrder().click();
        homePageVijar.closeAdverb().click();
        List<String> listFromSchedule = getElementsText(homePageVijar.getDigit());
        String firsDigitFromTable = listFromSchedule.get(0);
        SimpleDateFormat formater = new SimpleDateFormat("(dd.MM)");
        Date realDate = new Date();
        System.out.println(firsDigitFromTable);
        System.out.println(formater.format(realDate));
        // Тест рабочий но не завершен до логического конца, так как есть два вопроса.
    }
    @Test //14
    public void checkMainAdvertisement () {
        HomePageVijar homePageVijar = new HomePageVijar(driver);
        homePageVijar.enterToVijar("https://viyar.ua/");
        homePageVijar.closeAdverb().click();
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
        homePageVijar.clickAdvertisement().get(0).click();
        sleep(1);
    }
}
