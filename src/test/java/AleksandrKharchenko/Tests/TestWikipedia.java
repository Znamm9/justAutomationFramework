package AleksandrKharchenko.Tests;

import AleksandrKharchenko.Pages.*;
import ClasesToAllUs.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWikipedia extends TestInit {

    @Test
    public void testWikipediaSignIn() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();

        Assert.assertTrue(homePage.getNameOfUser().isDisplayed());
    }

    @Test
    public void testTransitionToAnArticle() {
        HomePage homePage = new HomePage(driver);
        ArticlePage articlePage = new ArticlePage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getSearchFieldWikipedia().sendKeys("Back to the future\n");
        articlePage.getLinkBackToTheFuture2().click();

        Assert.assertTrue(articlePage.getTextOnFuture2().isDisplayed());
    }

    @Test
    public void testCreateAnArticle() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MasterWikiPage masterWikiPage = new MasterWikiPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();
        homePage.getCreateArticleBtn().click();
        masterWikiPage.getStartWizardBtn().click();
        masterWikiPage.getAboutMyselfBtn().click();

        Assert.assertTrue(masterWikiPage.getSoItGoesMSG().isDisplayed());
    }

    @Test
    public void testCheckingTheChoiceOfAnotherLanguage() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getUkraineLanguageLink().click();

        Assert.assertTrue(homePage.getTextOnUkraineMSG().isDisplayed());
    }

    @Test
    public void testTheSettingOnWikipedia() {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SettingsPage settingsPage = new SettingsPage(driver);
        openUrl("https://ru.wikipedia.org/");
        homePage.getLinkSignInWikipedia().click();
        signInPage.getNameFieldSignInWikipedia().sendKeys("Alex8xela");
        signInPage.getPasswordFieldSignInWikipedia().sendKeys("qwsz1234");
        signInPage.getSignInBtnWikipedia().click();
        homePage.getSettingsLink().click();
        settingsPage.getEditingLink().click();
        settingsPage.getFirstCheckboxInEditing().click();
        settingsPage.getSaveBtn().click();

        Assert.assertTrue(settingsPage.getGreySaveBtn().isDisplayed());
    }

    @Test
    public void testNavigationSectionInTheLeftMenu() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://ru.wikipedia.org/");

        Assert.assertEquals(homePage.getHomePageLink().getText(), "Заглавная страница");
        Assert.assertEquals(homePage.getRubricationLink().getText(), "Рубрикация");
        Assert.assertEquals(homePage.getIndexLink().getText(), "Указатель А — Я");
        Assert.assertEquals(homePage.getFeaturedArticlesLink().getText(), "Избранные статьи");
        Assert.assertEquals(homePage.getRandomPageLink().getText(), "Случайная страница");
        Assert.assertEquals(homePage.getCurrentEventsLink().getText(), "Текущие события");
    }

    @Test
    public void testParticipationSectionInTheLeftMenu() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://ru.wikipedia.org/");

        Assert.assertTrue(homePage.getReportABugLink().isDisplayed());
        Assert.assertTrue(homePage.getCommunityLink().isDisplayed());
        Assert.assertTrue(homePage.getForumLink().isDisplayed());
        Assert.assertTrue(homePage.getRecentEditsLink().isDisplayed());
        Assert.assertTrue(homePage.getNewPagesLink().isDisplayed());
        Assert.assertTrue(homePage.getReferenceLink().isDisplayed());
        Assert.assertTrue(homePage.getDonateLink().isDisplayed());
    }
}