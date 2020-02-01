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

public class ProductPage extends CommonPage {

    @FindBy(xpath="//label[normalize-space(text()='Quantity']/following-sibling::input")
    private WebElement quantity;

    @FindBy(xpath="//label[contains(text(),'Size')]/parent::fieldset/descendant::Select")
    private WebElement size;

    @FindBy(xpath="//button[@type='submit']/child::span[text()='Add to cart']")
    private WebElement addToCart;

    // modal window
    @FindBy(xpath="//div[@id='layer_cart']/descendant::span[normalize-space(text())='Proceed to checkout']")
    private WebElement proceed;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void enterQuantity (int amount){
        selenium.getWaitForElement().waitForElementToBeVisible(selenium.getWebDriver(),quantity,TIME_OUT);
        quantity.sendKeys(Integer.toString(amount));
    }

    public void enterSize (String sizeString){
        selenium.selectByText(size,sizeString);
    }

    public void clickAdd (){
        addToCart.click();
    }

    public void confirm (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(),proceed,TIME_OUT);
        proceed.click();
    }

}
