package Julia.EatStreet.Pages;
import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAdressInput() {
        return driver.findElement(By.xpath("//input[@ng-model='searchParam']"));
    }

    public WebElement getGoItBtn(){
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement getFedBtn() {
        return driver.findElement((By.xpath("//a[@id='find-restaurants']")));
    }

    public List<WebElement> getPageNumberList() {
        return driver.findElements(By.xpath("//ul[@class='pagination__pages']//a"));
    }

    public List<WebElement> getAllRest() {
        return driver.findElements(By.xpath("//ul[@id='all-rests']/li"));
            }

    public void getSelectPageRest() {
        if (getPageNumberList().size() > 0) {
            sleep(5);
            getPageNumberList().get(getPageNumberList().size() - 1).click();
        }
    }

    public void getSelect70Rest() {
        if (getPageNumberList().size() > 0) {
            getPageNumberList().get(1).click();
            getAllRest().get(19).click();
        } else {
            getAllRest().get(getAllRest().size() - 1).click();
        }
    }

    public List<WebElement> getSearchAttempt() {
        return driver.findElements(By.xpath("//button[@class='btn']"));
    }

    public WebElement restName(){
        return  findElement("//a[contains(text(), 'York City')]");
    }

    public WebElement clickSignInBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement clickSingInWithGoogle() {
        return  driver.findElement(By.xpath("//div[@id='uniqueid']"));
    }

    public WebElement selectAccountWithGoogle() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Вход')]"));
    }

    public WebElement myAccountText() {
        return driver.findElement(By.xpath("//a[contains(text(), 'My Account')]"));
    }

    public WebElement clickSingInWithFacebook() {
        return driver.findElement(By.xpath("//a[@class='btn btn-facebook btn-facebook__sign-in full-width ng-scope']"));
    }

    public WebElement enterEmailWithFacebook() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }

    public WebElement enterPassWithFacebook() {
        return driver.findElement(By.xpath("////input[@id='pass']"));
    }

    public WebElement selectCityMuncie() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Muncie, IN').scrollIntoView(false)]"));
    }

    public WebElement selectCategoryLateNightFood() {
        return driver.findElement(By.xpath("//li[@class='cuisine-types__item']"));
    }

    public  WebElement selectRestInCity() {
        return driver.findElement(By.xpath("//button[@class='cuisine-types__item__button ng-binding']"));
    }

    public WebElement clickSearchMenu() {
        return driver.findElement(By.xpath("//input[@placeholder='Search Menu']"));
    }

    public WebElement checkTextDeluxPizza() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Deluxe Pizza')]"));
    }

    public WebElement clickSignUpLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]"));
    }

    public WebElement enterEmailField() {
        return driver.findElement(By.xpath("//input[@name='email']"));
    }

    public WebElement enterPassField() {
        return driver.findElement(By.xpath("//input[@name='password']"));
    }

    public WebElement enterPassAgainField() {
        return driver.findElement(By.xpath("//input[@name='passwordAgain']"));
    }

    public WebElement clickSignUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }

    public WebElement clickBtnLiveChat() {
        return driver.findElement(By.xpath("//span[@class ='ng-binding']"));
    }

    public WebElement enterMessageLiveChat() {
        return driver.findElement(By.xpath("//div[@id='liveAgentChatInput']/textarea"));
    }

    public WebElement clickBtnSend() {
        return driver.findElement(By.xpath("//button[@title='Send']"));
    }

    public WebElement answerBotLiveChat() {
        return driver.findElement(By.xpath("//div[contains(text(), 'EatStreet Bot')]"));
    }

    public void  checkAndClousePopUpWindow() {
        if (getSearchAttempt().size() > 0) {
            sleep(2);
            getSearchAttempt().get(0).click();
        }
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement btnApplyNow() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Apply Now')]"));
    }

    public WebElement applyCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Apply in Your City')]"));
    }

    public WebElement fieldApplyInYourCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Madison, WI.')]"));
    }

    public WebElement getDeliveryDriver() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Delivery Driver - Madison, WI.')]"));
    }

    public WebElement btnGetHelp() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Get Help')]"));
    }

    public WebElement getHelpBot() {
        return driver.findElement(By.xpath("//div[contains(text(), 'EatStreet Bot')]"));
    }

    public WebElement clickContactUs() {
        return driver.findElement(By.xpath("//a[@ui-sref='contact']"));
    }

    public WebElement getEmailFromContactUs() {
        return driver.findElement(By.xpath("//a[contains(text(), 'customer.service@eatstreet.com')]"));
    }

    public WebElement googleAppLink() {
        return driver.findElement(By.xpath("//a[@class='app-btn-android']"));
    }

    public WebElement getAppGooglePlay() {
        return driver.findElement(By.xpath("//a[contains(text(), 'EatStreet')]"));
    }

    public WebElement btnAPI() {
        return driver.findElement(By.xpath("//a[contains(text(), 'API')]"));
    }

    public WebElement getRestInNY() {
        return driver.findElement(By.xpath("//span[contains(text(), 'NY')]"));
    }

    public WebElement btnBlog() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Blog')]"));
    }

    public WebElement clickResentPost() {
        return driver.findElement(By.xpath("//section[@id='recent-posts']/article[@id='post-11918']"));

    }
    public WebElement selectCityDetroyd() {
        return driver.findElement(By.xpath("//a[contains(text(),'Detroit')]"));
    }

    public WebElement selectAsianCousin() {
        return driver.findElement(By.xpath("//button[contains(text(),'Asian')]"));
    }


    public WebElement tabBetterbin() {
            return driver.findElement(By.xpath("//a[contains(text(),'Betterbin')]"));
    }

    public WebElement getAsianFood() {
        return driver.findElement(By.xpath("//span[contains(text(),'Bangladeshi')]"));
    }

    public List<WebElement> getAdressSearchAttempt() {
        return driver.findElements(By.xpath("//div[@class='modal-footer']/a"));
    }

    public void  checkAndClouseAdressSearchAttempt() {
        if (getAdressSearchAttempt().size() > 0) {
            sleep(2);
            getAdressSearchAttempt().get(1).click();
        }
    }

    public List<WebElement> getItalianFoodLabel() {
        return driver.findElements(By.xpath("//ul[@class='filters-section_checkoxes']//label"));
    }

    public WebElement getItalianFood() {
        return driver.findElement(By.xpath("//span[contains(text(),'Italian Food')]"));
    }

    public WebElement getForCustomers() {
        return driver.findElement(By.xpath("//a[contains(text(), 'For Customers')]"));
    }

    public WebElement btnAssebilityStatement() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Accessibility Statement')]"));
    }

    public WebElement btnPrivasyPolicy() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]"));
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public WebElement clickBtnTermsUse() {
        return driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
    }

    public WebElement btnRestTerms() {
        return driver.findElement(By.xpath("//a[contains(text(),'Restaurant Terms')]"));
    }

    public WebElement btnRestDashboard() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Restaurant Dashboard')]"));
    }

    public WebElement btnCreateFreeAccount() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Create a free account')]"));
    }

    public WebElement getSignUpDashboard() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'Sign Up')]"));
    }

    public WebElement getBackToOrlando() {
        return driver.findElement(By.xpath("//a[contains(text(),'Back to Orlando, FL Restaurants')]"));
    }

    public WebElement getBackToCorvallis() {
        return driver.findElement(By.xpath("//a[contains(text(),'Back to Corvallis, OR Restaurants')]"));
    }
}
