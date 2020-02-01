package pl.com.aay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPage extends CommonPage {

    @FindBy(xpath="//a[text()='Best Sellers']")
    private WebElement bestSeller;

    @FindBy(xpath="//span[text()='Add to cart']")
    private WebElement addToCart;

    public BestSellerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openBestSeller (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), bestSeller,10);
        bestSeller.click();
    }

    public void addToCart (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), addToCart,10);
        addToCart.click();
    }

}
