package TestDenchikEnglishPrime.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageEnglishPrime extends BasePage {


    public LandingPageEnglishPrime(WebDriver driver) {
        super(driver);
    }
    public WebElement navMenuAboutSchoolButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/o-shkole/')]");
    }
    public WebElement navMenuCoursesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/kursi/')]");
    }
    public WebElement navMenuGuaranteesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/garantii/')]");
    }
    public WebElement navMenuScheduleButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/raspisanie/')]");
    }
    public WebElement navMenuFreeLessonButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/vvodniy-urok-free/')]");
    }
    public WebElement navMenuSpeakingClubButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'english-speaking-club-kiev/')]");
    }
    public WebElement navMenuContactsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'contact/')]");
    }
    public WebElement aboutSchoolDropDownListMethodButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/metodika/')]");
    }
    public WebElement aboutSchoolDropDownListStudyProgramButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/main-program/')]");
    }
    public WebElement aboutSchoolDropDownListGalleryButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/photos/')]");
    }
    public WebElement aboutSchoolDropDownListReviewsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/otzivi/')]");
    }
    public WebElement aboutSchoolDropDownListNewsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/news/')]");
    }
    public WebElement aboutSchoolDropDownListArticlesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/articles/')]");
    }
    public WebElement aboutSchoolDropDownListDiscountsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/akcii/')]");
    }
    public WebElement aboutSchoolDropDownListFAQButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/faq/')]");
    }
    public WebElement aboutSchoolDropDownListVacanciesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/vakansii/')]");
    }
    public WebElement aboutSchoolDropDownListScholarshipsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/scholarship/')]");
    }
    public WebElement coursesDropDownListOnlineCoursesButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/onlajn-kursy-anglijskogo-yazyka/')]");
    }
    public WebElement coursesDropDownListPrepearingForZNOButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/podgotovka-k-zno-po-anglijskomu-yazyku/')]");
    }
    public WebElement coursesDropDownListForBeginnersButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/english-language-for-beginners-kiev/')]");
    }
    public WebElement coursesDropDownListForStudentsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/english-language-for-schoolboys-kiev/')]");
    }
    public WebElement coursesDropDownListMasterCourseButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/masterskij-kurs-mastery/')]");
    }
    public WebElement coursesDropDownListIntensiveCourseButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/intensiv/')]");
    }
    public WebElement coursesDropDownListJobEnglishButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/kursy-korporativnogo-anglijskogo/')]");
    }
    public WebElement coursesDropDownListBusinessEnglishButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/business-english-language-kiev/')]");
    }
    public WebElement coursesDropDownListTravelEnglishButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/english-language-for-travelers-kiev/')]");
    }
    public WebElement coursesDropDownListEnglishForJobInterviewButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, 'https://englishprime.ua/english-language-interview-rabota-priem/')]");
    }
    public WebElement coursesDropDownListListeningSkillsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, '/advanced-listening-skills/')]");
    }
    public WebElement coursesDropDownListPrepearingForIELTSButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, '/kurs-podgotovki-k-ielts/')]");
    }
    public WebElement coursesDropDownListCoursesForAdultsButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, '/kursy-anglijskogo-dlya-vzroslyh/')]");
    }
    public WebElement contactsDropDownListPecherskayaButton(){
        return findElementByXpath("//nav[contains(@class, 'header-nav')]//a[contains(@href, '/kursy-anglijskogo-yazyka-na-metro-pecherskaya/')]");
    }
    public WebElement changeLanguageButton(){
        return findElementByXpath("//div[contains(@class, 'header-right')]//li[contains(@class, 'header-lang-item')]");
    }
    public WebElement ukrLanguageButton(){
        return findElementByXpath("//div[contains(@class, 'header-right')]//a[contains(@href, '/uk/')]");
    }
}
