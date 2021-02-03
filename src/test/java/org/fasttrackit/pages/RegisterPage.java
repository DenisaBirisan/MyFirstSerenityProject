package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/magento-test/customer/account/create/")
public class RegisterPage extends PageObject {
    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id="lastname")
    private WebElementFacade lastNameField;

    @FindBy(id="email_address")
    private WebElementFacade registerEmailAddressField;

    @FindBy(id = "password")
    private WebElementFacade registerPasswordField;

    @FindBy(id="confirmation")
    private WebElementFacade registerConfirmation;

    @FindBy(css = ".buttons-set button")
    private WebElementFacade registerButton;

    public void setFirstName(String firstName){
        typeInto(firstNameField,firstName);
    }
    public void setLastName(String lastName){
        typeInto(lastNameField,lastName);
    }
    public void setRegisterEmailAddress(String emailAdress){
        typeInto(registerEmailAddressField,emailAdress);
    }
    public void setRegisterPassword(String password){
        typeInto(registerPasswordField,password);
    }
    public void setRegisterConfirmation(String password){
        typeInto(registerConfirmation,password);
    }
    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }




}
