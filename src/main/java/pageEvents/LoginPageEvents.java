package pageEvents;

import org.testng.Assert;

import pageObject.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

    ElementFetch ele = new ElementFetch();    
    public void verifyIfLoginPageIsLoaded(){
        
        Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size()>0, "Element not found");

    }

    public void enterCredentials(){
        
        ele.geWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("fabriziomendezalberti@gmail.com");
        ele.geWebElement("XPATH", LoginPageElements.passwordField).sendKeys("12345");
    }
}
