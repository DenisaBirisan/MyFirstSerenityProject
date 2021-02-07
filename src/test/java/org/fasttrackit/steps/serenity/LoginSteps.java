package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Assert;

public class LoginSteps extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void setEmail(String email){
        loginPage.setEmailField(email);
    }

    public void setPassword(String password){
        loginPage.setPasswordField(password);
    }

    public void  clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void login (String userName, String password){
        navigateToLogin();
        setEmail(userName);
        setPassword(password);
        clickLoginButton();
    }

    @Step
    public void verifyAccountMessage(String userName){
        accountPage.verifyHelloMessage(userName);
    }

    @Step
    public void verifyIfMsgIsDisplayed(){
        Assert.assertTrue(accountPage.returnIfHelloMsgIsDisplayed());
    }

}
