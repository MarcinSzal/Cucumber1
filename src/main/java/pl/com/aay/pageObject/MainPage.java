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

import java.util.List;

public class MainPage extends CommonPage {

    @FindBy(id="search_query_top")
    private WebElement searchInput;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath="//b[text()='Cart']")
    private WebElement cart;

    @FindBy(xpath="(//ul[@id='homefeatured']/descendant::img)[1]")
    private WebElement firstProduct;

    //wykorzystywana jest do oznaczenia pól, dla których wykonana zostanie seria wyszukiwań, jedno po drugim:
    //W poniższym przykładzie, wyszukany zostanie pierwszy element posiadający atrybut class = "menu", który występuje w elemencie z atrybutem id = "menu"
    @FindBys(value = {
            @FindBy(className = "class1"),
            @FindBy(id= "id1")
    } )
    private WebElement elementFindBys;

    //zapamiętuje DOM dla wybranego elementu na stronie (WebElement). Umożliwia użycie zawsze tej samej instancji elementu
    @CacheLookup
    private WebElement elementsWithBoth_class1ANDclass2;

    //wykorzystywana jest do wyszukiwania wszystkich elementów spełniających jedno z zadanych kryteriów:
    @FindAll({
            @FindBy(className = "class1"),
            @FindBy(className = "class2"),
            @FindBy(id= "id1"),
            @FindBy(xpath= "id1")
    })
    private List<WebElement> elementsWithEither_class1ORclass2;

    public MainPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openMainPage (){
        selenium.openWebSite("http://automationpractice.com");
    }

    public void searchProduct (String productName){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), searchInput, 5);
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), searchButton, 5);
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    public void goToCart (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), cart, 5);
        cart.click();
    }

    public void clickOnFirstProduct (){
        selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(),firstProduct,TIME_OUT);
        getProduct("1").click();
    }

}
