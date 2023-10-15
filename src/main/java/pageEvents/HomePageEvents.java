package pageEvents;

import pageObject.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
    
    ElementFetch ele = new ElementFetch();
    
    public void signInButton(){
        ele.geWebElement("XPATH", HomePageElements.signInButtonText).click();
    }
    
}
