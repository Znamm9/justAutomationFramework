package AleksandrKharchenko.Pages;

import ClasesToAllUs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateHome() {
        driver.get("https://eatstreet.com/");
    }

    public WebElement getSignInLink() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement getCityLosAngeles() {
        return driver.findElement(By.xpath("//a[contains(text(),'Los Angeles, CA')]"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
    }
}