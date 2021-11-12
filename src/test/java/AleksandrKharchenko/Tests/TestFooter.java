package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.AboutUsPage;
import AleksandrKharchenko.Pages.CareersPage;
import AleksandrKharchenko.Pages.HomePage;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooter extends TestInit {

    @Test
    public void testCheckLinkAboutUs() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getAboutUsBtn().click();

        Assert.assertTrue(aboutUsPage.getTextAboutUs().isDisplayed());
    }

    @Test
    public void testCheckLinkLeadership() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getLeadershipBtn().click();

        Assert.assertTrue(aboutUsPage.getTextLeadership().isDisplayed());
    }

    @Test
    public void testCheckLinkInTheNews() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getInTheNewsBtn().click();
        aboutUsPage.getInTheNewsShowMoreBtn().click();

        Assert.assertTrue(aboutUsPage.getTextInNewsBtn().isDisplayed());
    }

    @Test
    public void testCheckLinkPressReleases() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getPressReleasesBtn().click();
        aboutUsPage.getShowMoreBtnPressReleases().click();

        Assert.assertTrue(aboutUsPage.getTextInNewsBtn().isDisplayed());
    }

    @Test
    public void testCheckLinkConnect() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getConnectBtn().click();

        Assert.assertTrue(aboutUsPage.getTextConnect().isDisplayed());
    }

    @Test
    public void testCheckLinkLearnMore() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getLinkLearnMore().click();
        sleep(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("/about-us"));
    }

    @Test
    public void testCheckBtnTech() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getTechBtn().click();
        careersPage.getAllLocationsLink().click();
        careersPage.getAmesCity().click();

        Assert.assertTrue(careersPage.getTextInSectionAllJobs().isDisplayed());
    }

    @Test
    public void testCheckBtnCulinaryCareers() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getCulinaryBtn().click();
        careersPage.getAllLocationsLink().click();
        careersPage.getMadisonCity().click();

        Assert.assertTrue(careersPage.getCurdNerd().isDisplayed());
    }

    @Test
    public void testCheckFieldSearchJobs() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getCareersLink().click();
        sleep(1);
        careersPage.getAmesCity().click();
        careersPage.getSearchJobsField().sendKeys("Product Analyst\n");

        Assert.assertTrue(careersPage.getTextInSectionAllJobs().isDisplayed());
    }

    @Test
    public void testCheckLinkBlog() {
        HomePage homePage = new HomePage(driver);
        AboutUsPage aboutUsPage = new AboutUsPage(driver);
        homePage.navigateHomeQa2();
        homePage.closeModal();
        homePage.getAboutUsLink().click();
        sleep(1);
        aboutUsPage.getLinkBlog().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("blog.eatstreet.com/"));
    }
}