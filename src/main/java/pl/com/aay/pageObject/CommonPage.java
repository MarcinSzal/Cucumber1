package pl.com.aay.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.com.aay.seleniumEngine.SeleniumEngine;

public class CommonPage  {

    protected final static int TIME_OUT=10;

    SeleniumEngine selenium=null;


    public CommonPage (WebDriver driver){
        selenium = new SeleniumEngine (driver);
    }

    protected WebElement getProduct (String lp){
        return selenium.getElement(lp);
    }

}
