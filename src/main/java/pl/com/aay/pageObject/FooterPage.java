package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends CommonPage {

    @FindBy(xpath="//h4[text()='Categories']")
    private WebElement categories;
    @FindBy(xpath="//h4[text()='Information']")
    private WebElement information;
    @FindBy(xpath="//a[text()='My account']")
    private WebElement myAccount;
    @FindBy(xpath="//h4[text()='Store information']")
    private WebElement storeInformation;

    public FooterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openCategories(){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), categories,10);
        categories.click();
    }

    public void openInformation (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), information,10);
        information.click();
    }

    public void openAccountLocator (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), myAccount,10);
        myAccount.click();
    }

    public void openstoreInformationL(){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), storeInformation,10);
        storeInformation.click();
    }
}
