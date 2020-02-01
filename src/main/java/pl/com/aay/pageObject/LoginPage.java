package pl.com.aay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {

    @FindBy(id = "email")
    private WebElement login;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    private WebElement loggin;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void loggin (String loginString, String passwordString){
        selenium.getWaitForElement().waitForElementToBeInvisible(selenium.getWebDriver(),login,TIME_OUT);
        login.sendKeys("mariusz@test.pl");
        password.sendKeys("pass123");
        loggin.click();
    }
}
