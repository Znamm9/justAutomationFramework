package Svetlana.EatstreetPage;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class AllRestsPage extends BasePage {


        public AllRestsPage (WebDriver driver){
            super(driver);
        }
        public List<WebElement> getAllRests() {
            return findElementsByXpath("//li[@ng-repeat='restaurant in $page']");
        }


    }
