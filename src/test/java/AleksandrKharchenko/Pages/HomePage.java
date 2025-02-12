package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateHome() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getSignInLink() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement getCityLosAngeles() {
        return driver.findElement(By.xpath("//a[contains(text(),'Los Angeles, CA')]"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
    }

    public void navigateHomeQa2() {
        driver.get("https://qa2.eatstreet.com/");
    }

    public WebElement getMyAccountLink() {
        return findElementByXpath("//a[@id='menu-my-account']");
    }

    public WebElement getGetTheAppLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Get The App')]"));
    }

    public WebElement getAddressField() {
        return findElementByXpath("//input[contains(@class,'enter-address__input')]");
    }

    public WebElement getFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//div[contains(@class,'modal-footer')]/a"));
    }

    public void checkAndClosePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            getSearchAttempt().get(1).click();
        }
    }

    public WebElement getApplyNowLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Apply Now')]"));
    }

    public WebElement getAboutUsLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='about-us']"));
    }

    public WebElement getCareersLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));
    }

    public WebElement getContactUsLink() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement getVegasCityLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'Las Vegas, NV')]"));
    }

    public WebElement getTakeoutBtn() {
        return driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']"));
    }

    public WebElement getRestaurantDashboardLink() {
        return driver.findElement(By.xpath("//a[@ng-click='linkToDashboardSupport()']"));
    }

    public WebElement getTermsOfUse() {
        return driver.findElement(By.xpath("//a[@ui-sref='terms']"));
    }

    public WebElement getForCustomersLink() {
        return findElementByXpath("//a[contains(text(),'For Customers')]");
    }

    public WebElement getLinkSignUp() {
        return findElementByXpath("//li[@class='login-tab']");
    }

    public WebElement getNameField() {
        return findElementByXpath("//input[@id='v-register-name']");
    }

    public WebElement getSignUpBtn() {
        return findElementByXpath("//button[@name='send']");
    }

    public WebElement getEmailField() {
        return findElementByXpath("//input[@id='v-register-email']");
    }

    public WebElement getPasswordField() {
        return findElementByXpath("//input[@id='vregister-password']");
    }

    public WebElement getErrorPhoneMSG() {
        return findElementByXpath("//span[contains(text(),'для заповнення.')]");
    }

    public List<WebElement> getErrorSignUpMSG() {
        return findElementsByXpath("//span[contains(text(),'для заповнення.')]");
    }

    public WebElement getLoginFieldSignInAllo() {
        return findElementByXpath("//input[@id='auth']");
    }

    public WebElement getPasswordFieldSignInAllo() {
        return findElementByXpath("//input[@id='v-login-password']");
    }

    public WebElement getEnterBtnSignInAllo() {
        return findElementByXpath("//button[@type='button' and contains(text(),'Вхід')]");
    }

    public WebElement getNumberOneInKorzina() {
        return findElementByXpath("//span[@class='c-counter']");
    }

    public WebElement getLinkSignInWikipedia() {
        return findElementByXpath("//li[@id='pt-login']");
    }

    public WebElement getNameOfUser() {
        return findElementByXpath("//span[contains(text(),'Alex8xela')]");
    }

    public WebElement getSearchFieldWikipedia() {
        return findElementByXpath("//input[@id='searchInput']");
    }

    public WebElement getCreateArticleBtn() {
        return findElementByXpath("//span[contains(text(),'Создать статью')]");
    }

    public WebElement getUkraineLanguageLink() {
        return findElementByXpath("//a[@lang='uk']");
    }

    public WebElement getTextOnUkraineMSG() {
        return findElementByXpath("//span[@id='Ласкаво_просимо_до_Вікіпедії,']");
    }

    public WebElement getSettingsLink() {
        return findElementByXpath("//span[contains(text(),'Настройки')]");
    }

    public WebElement getHomePageLink() {
        return findElementByXpath("//span[contains(text(),'Заглавная страница')]");
    }

    public WebElement getRubricationLink() {
        return findElementByXpath("//span[contains(text(),'Рубрикация')]");
    }

    public WebElement getIndexLink() {
        return findElementByXpath("//span[contains(text(),'Указатель А — Я')]");
    }

    public WebElement getFeaturedArticlesLink() {
        return findElementByXpath("//span[contains(text(),'Избранные статьи')]");
    }

    public WebElement getRandomPageLink() {
        return findElementByXpath("//span[contains(text(),'Случайная статья')]");
    }

    public WebElement getCurrentEventsLink() {
        return findElementByXpath("//a[@title='Статьи о текущих событиях в мире']");
    }

    public WebElement getReportABugLink() {
        return findElementByXpath("//a[@title='Сообщить об ошибке в этой статье']");
    }

    public WebElement getCommunityLink() {
        return findElementByXpath("//a[@title='О проекте, о том, чем здесь можно заниматься, а также — где что находится']");
    }

    public WebElement getForumLink() {
        return findElementByXpath("//a[@title='Форум участников Википедии']");
    }

    public WebElement getRecentEditsLink() {
        return findElementByXpath("//a[@title='Список последних изменений [alt-shift-r]']");
    }

    public WebElement getNewPagesLink() {
        return findElementByXpath("//a[@title='Список недавно созданных страниц']");
    }

    public WebElement getReferenceLink() {
        return findElementByXpath("//a[@title='Место расположения Справки']");
    }

    public WebElement getDonateLink() {
        return findElementByXpath("//a[@title='Поддержите нас']");
    }

    public WebElement getLinksHereLink() {
        return findElementByXpath("//span[contains(text(),'Ссылки сюда')]");
    }

    public WebElement getRelatedEditsLink() {
        return findElementByXpath("//span[contains(text(),'Связанные правки')]");
    }

    public WebElement getServicePagesLink() {
        return findElementByXpath("//span[contains(text(),'Служебные страницы')]");
    }

    public WebElement getPermalinkLink() {
        return findElementByXpath("//span[contains(text(),'Постоянная ссылка')]");
    }

    public WebElement getPageDetailsLink() {
        return findElementByXpath("//a[@title='Подробнее об этой странице']");
    }

    public WebElement getCreateABookLink() {
        return findElementByXpath("//span[contains(text(),'Создать книгу')]");
    }

    public WebElement getDownloadAsPDFLink() {
        return findElementByXpath("//span[contains(text(),'Скачать как PDF')]");
    }

    public WebElement getPrintVersionLink() {
        return findElementByXpath("//span[contains(text(),'Версия для печати')]");
    }

    public WebElement getNotIntroducedYourselfMSG() {
        return findElementByXpath("//li[@id='pt-anonuserpage']");
    }

    public WebElement getDiscussionLink() {
        return findElementByXpath("//a[@accesskey='n']");
    }

    public WebElement getContributionLink() {
        return findElementByXpath("//a[@accesskey='y']");
    }

    public WebElement getCreateAnAccountLink() {
        return findElementByXpath("//a[@title='Мы предлагаем вам создать учётную запись и войти в систему, хотя это и не обязательно.']");
    }

    public WebElement getTitleLink() {
        return findElementByXpath("//a[@accesskey='c']//span");
    }

    public WebElement getDiscussionCenterLink() {
        return findElementByXpath("//a[@accesskey='t']/span");
    }

    public WebElement getReadLink() {
        return findElementByXpath("//li[@id='ca-view']//span");
    }

    public WebElement getViewCodeLink() {
        return findElement("//a[@accesskey='e']/span");
    }

    public WebElement getHistoryLink() {
        return findElementByXpath("//a[@accesskey='h']/span");
    }

    public WebElement getSearchInput() {
        return findElementByXpath("//input[@id='searchInput']");
    }

    public WebElement getSearchButton() {
        return findElementByXpath("//input[@id='searchButton']");
    }

    public WebElement getWikipediaLink() {
        return findElementByXpath("//a[@title='Википедия']");
    }

    public WebElement getFreeEncyclopediaLink() {
        return findElementByXpath("//a[@title='Свободный контент']");
    }

    public WebElement getAnyoneCanEditLink() {
        return findElementByXpath("//a[@title='Справка:Введение в Википедию']");
    }

    public WebElement getStatisticsLink() {
        return findElementByXpath("//a[@title='Служебная:Статистика']");
    }

    public WebElement getInRussianLink() {
        return findElementByXpath("//a[@title='Русский язык']");
    }

    public WebElement getPortalsLink() {
        return findElementByXpath("//a[@title='Портал:Обзор']");
    }

    public WebElement getReferenceBtnLink() {
        return findElementByXpath("//a[@title='Википедия:Справка']");
    }

    public WebElement getLinkSalinaCity() {
        return findElementByXpath("//a[text()='Salina']");
    }

    public WebElement getLinkSaltLakeCity() {
        return findElementByXpath("//a[text()='Salt Lake City, UT']");
    }

    public WebElement getBtnTarifi() {
        return findElementByXpath("//a[text()='ТАРИФИ']");
    }

    public WebElement getBtnProfile() {
        return findElementByXpath("//button[@aria-label='Профіль']");
    }

    public WebElement getFieldAllUkraine() {
        return findElementByXpath("//input[@id='cityField']");
    }

    public WebElement getVolynskayaObl() {
        return findElementByXpath("//span[contains(text(),'Волынская')]");
    }

    public WebElement closeModalOlx() {
        return findElementByXpath("//button[text()='Принять и Закрыть']");
    }

    public WebElement getCityLutsk() {
        return findElementByXpath("//a[@id='a-region-72']");
    }

    public WebElement getNedvigimostSection() {
        return findElementByXpath("//a[contains(@href, 'ua/nedvizhimost/lu')]//span[contains(text(),'Недвижимость')]");
    }

    public WebElement getLinkFlat() {
        return findElementByXpath("//span//span[contains(text(),'Квартиры')]");
    }

    public boolean isDisplayedFlatInLuck() {
        return findElementByXpath("//h1[contains(text(),'Квартиры Луцк')]").isDisplayed();
    }

    public WebElement getLinkMyProfile() {
        return findElementByXpath("//strong[text()='Мой профиль']");
    }

    public WebElement getLinkMova() {
        return findElementByXpath("//a[@id='changeLang']");
    }

    public WebElement getBtnWork() {
        return findElementByXpath("//span[contains(@class,'cat-cmt-icon-6')]");
    }

    public WebElement getLinkAdvertising() {
        return findElementByXpath("//span[contains(text(),'дизайн / PR')]");
    }

    public boolean isDisplayedAdvertising() {
        return findElementByXpath("//span[@id='main-category-choose-label']").isDisplayed();
    }
}