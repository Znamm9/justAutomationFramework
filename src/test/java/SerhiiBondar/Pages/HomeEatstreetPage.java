package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeEatstreetPage extends BasePage {


    public HomeEatstreetPage(WebDriver driver) {
        super(driver);

    }
    public WebElement getSignInBtn(){
        return findElementByXpath("//a[@id='menu-signin']");

    }
    public List<WebElement> getMyAccountBtn(){
        return driver.findElements(By.xpath("//a[@id='menu-my-account']"));

    }
    public WebElement myAccountBtn(){
        return findElementByXpath("//a[@id='menu-my-account']");

    }
    public WebElement getGoItBtn(){
        return  driver.findElement(By.xpath("//button[@class='btn']"));

    }
    public WebElement getPartnerWithUsBtn(){
        return driver.findElement(By.className("partners-link"));

    }
    public WebElement getApplyNowLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Apply Now')]"));

    }
    public WebElement getCityAppleton(){
        return driver.findElement(By.xpath("//option[contains(text(),'Appleton')]"));

    }
    public WebElement getApplyInYourCityField(){
        return driver.findElement(By.xpath("//select[contains(@onchange, 'location')]"));

    }
    public WebElement getDriverInCityString(){
        return driver.findElement(By.xpath("//span[contains(@class,'page-title')]"));

    }
    public WebElement getCareersBtn(){
        return driver.findElement(By.xpath("//a[@ui-sref='careers']"));

    }
    public WebElement getAllJobsTable(){
        return driver.findElement(By.xpath("//div[@class='careers-listing-container']"));

    }
    public WebElement getBurgers(){
        return driver.findElement(By.xpath("//button[contains(text(),'View all Burger options')]"));

    }
    public WebElement getAtlanta(){
        return driver.findElement(By.xpath("//a[contains(text(),'Atlanta')]"));

    }
    public WebElement getForCustomersLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'For Customers')]"));

    }
    public WebElement getFAQsLink(){
        return driver.findElement(By.xpath("//div[contains(text(),'FAQs')]"));

    }
    public WebElement getGiftCardQuestionLink(){
        return driver.findElement(By.xpath("//h2[contains(text(),'gift card')]"));

    }
    public WebElement getGiftCardQuestion(){
        return driver.findElement(By.xpath("//h1[contains(text(),'gift card')]"));

    }
    public WebElement getAnswer(){
        return findElementByXpath("//span[contains(text(),'Answer')]");

    }
    public WebElement getEnterYourAddressLink(){
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));

    }
    public WebElement getFedBtn(){
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));

    }
    public List<WebElement> addressSearchAttempModalWindow(){
        return driver.findElements(By.xpath("//div[@class='modal-content']"));

    }
    public WebElement getEnterAddressBtn(){
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));

    }
    public void passModalWindow(){
        if (addressSearchAttempModalWindow().size()>0){
            getEnterAddressBtn().click();}
        else{getFedBtn().click();}
    }
    public WebElement getTheAppLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Get The App')]"));

    }
    public WebElement getLogoBtn(){
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));

    }
    public WebElement getContactUsLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));

    }
    public WebElement getAboutUsLink() {
        return driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));

    }
    public WebElement getConnectLink(){
        return waitElementToBeClickable("//button[contains(text(),'Connect')]");

    }
    public List<WebElement> connectionMethods(){
        return driver.findElements(By.xpath("//li[@class='connect__item']"));

    }
    public WebElement getFacebookConnectBtn() {
        return driver.findElement(By.xpath("//a[@aria-label='facebook']"));

    }
    public WebElement getTwitterConnectBtn() {
        return driver.findElement(By.xpath("//a[@aria-label='twitter']"));

    }
    public WebElement getInstaConnectBtn() {
        return driver.findElement(By.xpath("//a[@aria-label='instagram']"));

    }
    public WebElement getGoogleConnectBtn() {
        return driver.findElement(By.xpath("//a[@aria-label='google plus']"));

    }
    public WebElement getLinkedInConnectBtn() {
        return driver.findElement(By.xpath("//a[@aria-label='linkedin']"));

    }
    public WebElement getPrivacyLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));

    }
    public WebElement getTermsOfUseLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));

    }
    public WebElement getRestaurantsTermsLink(){
        return driver.findElement(By.xpath("//a[contains(text(),'Restaurant Terms')]"));

    }
    public WebElement getAccountQuestionsSection(){
        return driver.findElement(By.xpath("//div[contains(text(),'Account Questions')]"));

    }
    public List<WebElement> listOfQuestions(){
        return driver.findElements(By.xpath("//h2[@class='article-head']"));

    }
    public WebElement questionsTitle(){
        return findElementByXpath("//h1[contains(@class,'article-head')]");

    }
    public WebElement getAccessibilityLink(){
        return findElementByXpath("//a[contains(text(),'Accessibility')]");

    }
    public WebElement getAPILink(){
        return findElementByXpath("//a[contains(text(),'API')]");

    }
    public WebElement getAppStoreLink(){
        return findElementByXpath("//a[@class='app-btn-iphone']");

    }
    public WebElement getGooglePlayLink(){
        return findElementByXpath("//a[@class='app-btn-android']");

    }
}
