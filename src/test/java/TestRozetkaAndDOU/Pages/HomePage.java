package TestRozetkaAndDOU.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public String gools = "Холодильник";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchField() {
        return findElementByXpath("//input[@name='search']");
    }

    public WebElement getRefrigerator() {
        return findElementByXpath("//span[@class='goods-tile__title']");
    }

    public WebElement addCart() {
        return findElementByXpath("//button[@class=" +
                                "'buy-button button button_with_icon button_color_green button_size_large']");
    }

    public WebElement getButtonField() {
        return findElementByXpath("//button[@class='button button_color_green button_size_medium search-form__submit']");
    }

    public WebElement getPhone() {
        return findElementByXpath("//a[@href='https://rozetka.com.ua/ua/mobile-phones/c80003/preset=smartfon/']");
    }

    public List<WebElement> getPhoneProductCatalog() {
        return findElementsByXpath("//a[@class='menu-categories__link']");
    }

    public WebElement getCheckBoxApple() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='Apple']")));

    }

    public WebElement productCatalog() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='fat-menu']")));
    }

    public List<WebElement> getElementsRefrigerator() {
        return findElementsByXpath("//div[@class='goods-tile__inner']/a[contains(@title,'Холодильник')]");
    }

    public List<WebElement> getElementsGoods() {
        return findElementsByXpath("//a[@class='goods-tile__picture']");
    }

    public WebElement contacts() {
        return wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//a[@href='https://rozetka.com.ua/contacts/']")));
    }

    public WebElement advertisingOnHome() {
        return wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//a[@id='rz-banner']")));
    }

    public List<WebElement> allGoodsCost() {
        return findElementsByXpath("//span[@class='goods-tile__price-value']");
    }

    public WebElement catalogSettingzSorting() {
        return findElementByXpath("//select[contains(@class,'select-css')]");
    }

    public List<WebElement> catalogSettingzSortingChildren() {
        return findElementsByXpath("//select[contains(@class,'select-css')]/child::option");
    }

    public WebElement getLanguageRU() {
        return findElementByXpath("//a[@class='lang__link']");
    }

    public List<WebElement> getTextOnPage() {
        return findElementsByXpath("//h2[@class='main-goods__heading']");
    }


    public List<WebElement> getCompareButtons() {
        return findElementsByXpath("//button[@class='compare-button']");
    }

    public List<WebElement> getHeaderButton() {
        return findElementsByXpath("//button[@class='header__button']");
    }

    public WebElement getComparisonModalLink() {
        return findElementByXpath("//a[@class='comparison-modal__link']");
    }

    public List<WebElement> getProductHeading() {
        return findElementsByXpath("//a[@class='product__heading']");
    }

    public List<WebElement> getGoodsTileHeading() {
        return findElementsByXpath("//a[@class='goods-tile__heading']");
    }

    public WebElement getHelpCentre() {
        return findElementByXpath("//a[text()=' Справочный центр ']");
    }

    public WebElement getSearchFieldHelpCentre() {
        return findElementByXpath("//input[@id='query']");
    }

    public List<WebElement> getTextOnPgeHelpCenter() {
        return findElementsByXpath("//ul[@class='search" +
                "-results-list']/li/a");
    }

    public List<WebElement> getButtonProductFilter() {
        return findElementsByXpath("//ul[@class='tabs__list']/li/a");
    }

    public WebElement getButtonCityToggle() {
        return findElementByXpath("//button[@class='city-toggle button button--small button--white']");
    }

    public List<WebElement> getHeaderLocation() {
        return findElementsByXpath("//a[@class='header-location__popular-link']");
    }

    public WebElement getAutocompleteInput() {
        return findElementByXpath("//input[@class='autocomplete__input ng-valid ng-dirty ng-touched']");
    }

    public WebElement getButtonApplyCity() {
        return findElementByXpath("//button[@class='button button_size_medium button_color_green']");
    }

    public WebElement getSliderRangeButtonLeft() {
        return findElementByXpath("//button[@class='rz-slider__range-button rz-slider__range-button_type_left']");
    }
}
