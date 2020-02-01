package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsletterPage extends CommonPage {

    @FindBy(id="newsletter-input")
    private WebElement emailInput;
    @FindBy(xpath="//button[@name='submitNewsletter']")
    private WebElement emailButton;

    public NewsletterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void sendEmailNewsletter(){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), emailInput, 5);
        emailInput.sendKeys("test@test.pl");
        emailButton.click();
    }
}
