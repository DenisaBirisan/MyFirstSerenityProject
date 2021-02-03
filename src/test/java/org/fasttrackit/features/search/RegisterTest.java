package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegisterTest {
    @Managed(uniqueSession = false)
    private WebDriver webDriver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validCredentialsRegister(){
        registerSteps.navigateToRegister();
        registerSteps.register("Den","b","db@Yahoo.com","123456","123456");
        registerSteps.verifyRegisteredMessage();
    }





}
