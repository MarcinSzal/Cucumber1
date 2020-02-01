package pl.com.aay.pageObject;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ContactUsPage extends CommonPage {

	@FindBy(id="id_contact")
	private WebElement subject;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="id_order")
	private WebElement order;

	@FindBy(id="message")
	private WebElement messeges;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement send;

	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement alert;

    public ContactUsPage (WebDriver driver){
    	super(driver);
		PageFactory.initElements(driver, this);
	}
    
    public void sendEmailToContact (String topic, String emailText, String orderString, String message) {
		selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), subject, TIME_OUT);
		selenium.selectByText(subject, topic);
		email.sendKeys(emailText);
		order.sendKeys(orderString);
		messeges.sendKeys(message);
	}

	public void sendEmailToContact (DataTable dt) {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		selenium.getWaitForElement().waitForElementToBeClickable(selenium.getWebDriver(), subject, TIME_OUT);
		selenium.selectByText(subject, list.get(0).get("temat"));
		email.sendKeys(list.get(0).get("email"));
		order.sendKeys(list.get(0).get("order"));
		messeges.sendKeys(list.get(0).get("message"));
	}


	public void sendEmail (){
    	send.click();
	}

	public String getAlert (){
    	selenium.getWaitForElement().waitForElementToBeVisible(selenium.getWebDriver(),alert,TIME_OUT);
    	return alert.getText();
	}
}
