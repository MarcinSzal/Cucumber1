package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SummaryProductPage extends CommonPage {

    @FindBy(xpath="//span[normalize-space(text())='Proceed to checkout']")
    private WebElement proceedSummary;

    @FindBy(id="cgv")
    private WebElement termsOfService;

    @FindBy(xpath="//a[@title='Pay by bank wire']")
    private WebElement payByBankWire;

    public SummaryProductPage(WebDriver driver) {
        super(driver);
    }

    public void proceedProduct (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(),proceedSummary,TIME_OUT);
        proceedSummary.click();
    }

    public void confirmTerms (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(),termsOfService,TIME_OUT);
        termsOfService.click();
    }

    public void pay (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(),payByBankWire,TIME_OUT);
        payByBankWire.click();
    }

}
