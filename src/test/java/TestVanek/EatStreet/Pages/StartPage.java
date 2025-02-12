package TestVanek.EatStreet.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver){ super(driver); }

    public WebElement signInBtn(){
        return findElementByXpath("//a[@class='btn btn-sign-in visible_focus ng-scope btn-sign-in-alternate remove-margin']");
    }
    public WebElement searchAddressInput(){
        return findElementByXpath("//input[@ng-model='searchParam']");
    }
    public WebElement getFedBtn(){
        return findElementByXpath("//a[@class='btn btn-action btn-food-search btn-food-search--home full-width visible_focus']");
    }
    public WebElement addressSearchAttemptEnter(){
        return findElementByXpath("//a[@class='btn btn-primary float-right']");
    }
    public WebElement myAccounBtn(){
        return findElementByXpath("//a[contains(@id,'menu')]");
    }
    public WebElement learnMoreBtn(){
        return findElementByXpath("//a[contains(text(),'Learn')]");
    }
    public WebElement getTheAppBtn(){
        return findElementByXpath("//a[contains(text(),'Get The')]");
    }
    public WebElement applyNowBtn(){
        return findElementByXpath("//a[contains(text(),'Apply Now')]");
    }
    public WebElement gotItBtn(){
        return findElementByXpath("//button[contains(text(),'Got')]");
    }
    public WebElement phoenixRestaurantsPageBtn(){
        return findElementByXpath("//a[contains(text(),'Phoenix')]");
    }
    public WebElement aboutUsBtn(){
        return findElementByXpath("//a[contains(text(),'About Us')]");
    }
    public WebElement forCustomerBtn(){
        return findElementByXpath("//a[contains(text(),'For Customers')]");
    }
    public WebElement privacyBtn(){
        return findElementByXpath("//a[contains(text(),'Privacy Policy')]");
    }
    public WebElement playMarketBtn(){
        return findElementByXpath("//a[contains(@class,'app-btn-android')]");
    }
    public WebElement appStoreBtn(){
        return findElementByXpath("//a[contains(@class,'app-btn-iphone')]");
    }
    public WebElement emailInput(){
        return findElementByXpath("//input[contains(@id,'new-email')]");
    }
    public WebElement emailSignInBtn(){
        return findElementByXpath("//button[contains(text(),'Sign Up')]");
    }
    public WebElement whoopsModalBodyText(){
        return findElementByXpath("//div[contains(@class,'modal-body')]");
    }
    public WebElement tablet(){
        return findElementByXpath("//div[contains(@class,'tablet')]");
    }
    public List<WebElement> mediaLinks(){
        return findElementsByXpath("//ul[contains(@aria-label,'media')]/li");
    }
}