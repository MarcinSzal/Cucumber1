package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopularPage extends CommonPage {

    @FindBy(xpath="//a[text()='Popular']")
    private WebElement popular;
    @FindBy(xpath="//span[text()='Add to cart']")
    private WebElement addToCart;

    public PopularPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openPopular(){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), popular, 5);
        popular.click();
    }

    public void addToCart (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), addToCart, 5);
        addToCart.click();
    }
}
