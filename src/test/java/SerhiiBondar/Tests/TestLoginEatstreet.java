package SerhiiBondar.Tests;

import ClasesToAllUs.TestInit;
import SerhiiBondar.Pages.HomeEatstreetPage;
import SerhiiBondar.Pages.MyAccountPageEatstreet;
import SerhiiBondar.Pages.SingInEatstreetPage;
import SerhiiBondar.Pages.SingUpEatstreetPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginEatstreet extends TestInit {
    @Test
    public void testLogInWithIncorrectCreds(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blabla@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("1234567");
        singInEatstreetPage.getSignInBtn().click();
        sleep(5);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());
    }
    @Test
    public void testEmailField(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("blablabla");
        singInEatstreetPage.getPasswordField().click();

        Assert.assertEquals(singInEatstreetPage.enterValidEmailAddressText().getText(),
                "Please enter a valid email address");

    }
    @Test
    public void testNewUserRegistration(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("serhiibondar2@gmail.com");
        singUpEatstreetPage.getPasswordForSignUpField().sendKeys("club2021");
        singUpEatstreetPage.getPasswordAgainField().sendKeys("club2021");
        singUpEatstreetPage.getSignUpBtn().click();
        sleep(5);

        Assert.assertTrue(homeEatstreetPage.getMyAccountBtn().size()>0);
    }
    @Test
    public void  testAccountDeactivation(){
        HomeEatstreetPage homeEatstreetPage = new HomeEatstreetPage(driver);
        SingInEatstreetPage singInEatstreetPage = new SingInEatstreetPage(driver);
        openUrl("https://eatstreet.com/");
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getSignUpLine().click();
        SingUpEatstreetPage singUpEatstreetPage = new SingUpEatstreetPage(driver);
        singUpEatstreetPage.getSingUpEmailField().sendKeys("serhiibondar2@gmail.com");
        singUpEatstreetPage.getPasswordForSignUpField().sendKeys("club2021");
        singUpEatstreetPage.getPasswordAgainField().sendKeys("club2021");
        singUpEatstreetPage.getSignUpBtn().click();
        sleep(5);
        homeEatstreetPage.myAccountBtn().click();
        MyAccountPageEatstreet myAccountPageEatstreet = new MyAccountPageEatstreet(driver);
        myAccountPageEatstreet.getDeactivateAccountBtn().click();
        myAccountPageEatstreet.getDeactivationAccountBtnYes().click();
        sleep(1);
        myAccountPageEatstreet.getOkayBtn().click();
        homeEatstreetPage.getSignInBtn().click();
        singInEatstreetPage.getEmailField().sendKeys("serhiibondar2@gmail.com");
        singInEatstreetPage.getPasswordField().sendKeys("club2021");
        singInEatstreetPage.getSignInBtn().click();
        sleep(3);

        Assert.assertTrue(singInEatstreetPage.incorrectLogInInformation().isDisplayed());






    }

}