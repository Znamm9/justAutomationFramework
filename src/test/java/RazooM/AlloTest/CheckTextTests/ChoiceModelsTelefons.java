package RazooM.AlloTest.CheckTextTests;

import RazooM.AlloTest.Pages.LocatorsForPriceCheckTelefons;
import ClasesToAllUs.TestInit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.List;

public class ChoiceModelsTelefons extends TestInit {

    @Test
    public void choiceModelsTelefons() {
        LocatorsForPriceCheckTelefons locators = new LocatorsForPriceCheckTelefons(driver);
        openUrl("https://allo.ua/ru/");
        locators.smartAndTelefons().click();
        locators.telefons().click();
        locators.samsung().click();
        locators.showFilterTelefons().click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("samsung"));
        List<String> list = getAttributeCollection(locators.listSamsung(), "title");
        String  token = "Samsung";
        for(String l:list){
            if(l.contains(token)){
                System.out.println("Совпадение с самсунгом");
            } else {
                System.out.println("Нету совпадений с самсунгом");
            }
        }
    }
}
