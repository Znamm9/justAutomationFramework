package SerhiiBondar.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SingUpEatstreetPage extends BasePage {

    public SingUpEatstreetPage(WebDriver driver) {
        super(driver);

    }

    public WebElement getSingUpEmailField(){
        return driver.findElement(By.xpath("//input[@id='email']"));

    }
    public WebElement getPasswordForSignUpField(){
        return driver.findElement(By.xpath("//input[@id='password']"));

    }
    public WebElement getPasswordAgainField(){
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));

    }
    public WebElement getSignUpBtn(){
        return driver.findElement(By.xpath("//button[@id='signup']"));

    }
    public WebElement wrongEnteredEmail(){
        return driver.findElement(By.xpath("//div[@id='email-validation-tag']"));

    }
    public WebElement getMustMachString(){
        return driver.findElement(By.xpath("//div[contains(@class,'validation-tag')]"));

    }
    public List<WebElement> getShowPasswordBtn(){
        return driver.findElements(By.xpath("//div[@ng-if='displayPasswordToggler']"));

    }

}
