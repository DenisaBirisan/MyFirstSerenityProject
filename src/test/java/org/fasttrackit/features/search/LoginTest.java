package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validCredentialLoginTest(){
        loginSteps.navigateToLogin();
     //   loginSteps.setEmail("deni.b@yahoo.com");
     //   loginSteps.setPassword("123456");
    //    loginSteps.clickLoginButton();
        loginSteps.login("deni.b@yahoo.com","123456");
        loginSteps.verifyAccountMessage("Deni Test");



    }
}
