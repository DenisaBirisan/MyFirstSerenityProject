package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void register(String firstaName,String lastName,String email, String password, String confirmation){
        registerPage.setFirstName(firstaName);
        registerPage.setLastName(lastName);
        registerPage.setRegisterEmailAddress(email);
        registerPage.setRegisterPassword(password);
        registerPage.setRegisterConfirmation(confirmation);
    }
    @Step
    public void verifyRegisteredMessage(){
        accountPage.verifySuccesfullyRegisteredMessage();
    }
    @Step
    public void verifyIfRegisteredMessageIsDisplayed(){
        Assert.assertTrue(accountPage.returnIfSUccesfullyRegisteredMsgIsDisplayed());
    }

}
