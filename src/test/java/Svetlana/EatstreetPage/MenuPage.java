package Svetlana.EatstreetPage;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> selectMenuList() {
        return findElementsByXpath("//div[@class='list list--menu list--menu--scale']");
    }

    public List<WebElement> selectADish() {
        return findElementsByXpath("//section[@class='li li--menu ng-scope has-photo-url']");
    }

    public List<WebElement> selectADishRoyalDaly() {
        return findElementsByXpath("//div[@class='is-clickable product-container']");
    }

    public WebElement checkMenubtn() {
        return findElementByXpath("//label[@for='menu']");
    }

    public WebElement checkVegetarianBtn() {
        return findElementByXpath("//span[@class='active_filter ng-binding ng-scope']");
    }

    public List<WebElement> selectDishAllAboutIndianFood() {
        return findElementsByXpath("//span[@class='restaurant-description ng-binding']");
    }

    public WebElement addQuantity() {
        return findElementByXpath("//button[@id='quantity--adds']");
    }
}
