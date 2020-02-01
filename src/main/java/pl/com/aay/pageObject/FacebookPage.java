package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends CommonPage {

    @FindBy(xpath="//h4[text()='Follow us on Facebook']")
    private WebElement facebook;
    @FindBy(xpath="//h3[text()='Come Visit Us']")
    private WebElement comeVisit;
    @FindBy(xpath="//h3[text()='Call Us']")
    private WebElement callUs;

    public FacebookPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickFacebook (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), facebook,10);
        facebook.click();
    }

    public void clickComeVisit (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), comeVisit,10);
        comeVisit.click();
    }

    public void clickCallUsLocator(){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), callUs,10);
        callUs.click();
    }
}
