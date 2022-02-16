package TestMarkEatStreet.Page;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForCutomersPage extends BasePage{
    public ForCutomersPage(WebDriver driver){super(driver);}
    public WebElement gettoknowusbtn(){return findElementByXpath("//div[contains(@class,'topicContent')]//*[contains(text(),'Get To Know')]");}
}