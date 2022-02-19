package TestDenchikEnglishPrime.Tests;

import ClasesToAllUs.TestInit;
import TestDenchikEnglishPrime.Pages.LandingPageEnglishPrime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutSchoolDropDownListDiscountsButton extends TestInit {
    LandingPageEnglishPrime landingPageEnglishPrime;
    @Test
    public void aboutSchoolDropDownListDiscountsButton(){
        driver.get("https://englishprime.ua/");
        landingPageEnglishPrime = new LandingPageEnglishPrime(driver);
        WebElement element = landingPageEnglishPrime.navMenuAboutSchoolButton();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        landingPageEnglishPrime.aboutSchoolDropDownListDiscountsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("akcii"));
    }
}
