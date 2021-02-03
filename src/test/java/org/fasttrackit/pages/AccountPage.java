package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class AccountPage extends PageObject {

    @FindBy(css=".hello strong")
    private WebElementFacade helloMessage;

    public void  verifyHelloMessage(String userName){
        shouldContainText("Hello, "+userName+"!");
    }
    public boolean returnIfHelloMsgIsDisplayed(){
        return helloMessage.isDisabled();
    }

    @FindBy(css = "li.success-msg ul span")
    private WebElementFacade succesfullyRegisteredMessage;

    public void verifySuccesfullyRegisteredMessage(){
        shouldContainText("Thank you for registering with Madison Island.");
    }
    public boolean returnIfSUccesfullyRegisteredMsgIsDisplayed(){
        return succesfullyRegisteredMessage.isDisabled();
    }

}
