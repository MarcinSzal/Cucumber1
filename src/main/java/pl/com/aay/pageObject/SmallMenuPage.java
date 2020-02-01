package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallMenuPage extends CommonPage {

    @FindBy(xpath="//img[@class='img-responsive']")
    private WebElement banner;
    @FindBy(xpath="//a[text()='Contact us']")
    private WebElement contactUs;
    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    private WebElement signIn;

    public SmallMenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBunner (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), banner, TIME_OUT);
        banner.click ();
    }

    public void openContactUs (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), contactUs, TIME_OUT);
        contactUs.click();
    }

    public void openSignIn (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), signIn, TIME_OUT);
        signIn.click();
    }
}
