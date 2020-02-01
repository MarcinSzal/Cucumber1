package pl.com.aay.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.com.aay.seleniumEngine.SeleniumEngine;

public class CartPage extends CommonPage {

	@FindBy(xpath="//p[@class='alert alert-warning']")
	private WebElement alert;


	public CartPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void checkAllertCart (){
		selenium.getWaitForElement().waitForElementToBeVisible(selenium.getWebDriver(), alert, 5);
		System.out.println("ALERT TEXT: "+alert.getText());
	}

}
