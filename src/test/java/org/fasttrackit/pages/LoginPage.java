package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/magento-test/customer/account/login/")
public class LoginPage extends PageObject{

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id="send2")
    private WebElementFacade loginButton;

    public void setEmailField(String userName){
        typeInto(emailField,userName);
    }

    public void setPasswordField(String password){
        typeInto(passwordField,password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }


}
