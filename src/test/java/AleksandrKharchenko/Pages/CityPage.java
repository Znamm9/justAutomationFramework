package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CityPage extends BasePage {
    public CityPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCoffeeTeaInLosAngeles() {
        return driver.findElement(By.xpath("(//ul[@class='cuisine-types__list']//li)[6]"));
    }

    public boolean getTextDessertIsDisplayed() {
        return findElementByXpath("//span[text()='Dessert']").isDisplayed();
    }

    public WebElement getBtnPizza() {
        return findElementByXpath("//button[contains(text(),'Pizza options')]");
    }

    public boolean isDisplayedTextSaltLakeCityRestaurants() {
        return findElementByXpath("//h1[contains(text(),'Salt Lake City Restaurants')]").isDisplayed();
    }

    public WebElement getCheckboxBurgers() {
        return findElementByXpath("//label[@for='filter-cuisine-Burgers' and @class='checkbox-input']");
    }

    public boolean isDisplayedSpanBurgers() {
        return findElementByXpath("//span[@ng-repeat='filter in activeFilters']").isDisplayed();
    }
}