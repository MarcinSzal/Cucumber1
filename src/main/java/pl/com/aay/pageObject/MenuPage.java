package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends CommonPage {

    @FindBy (xpath="//a[text()='Women']")
    private WebElement women;
    @FindBy(xpath="//a[text()='Dresses']")
    private WebElement dresses;
    @FindBy(xpath="//a[text()='T-shirts']")
    private WebElement tshirt;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openAllMenu () {
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), women, 5);
        women.click();
    }
}
