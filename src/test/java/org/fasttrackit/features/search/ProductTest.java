package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.ProductSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Steps
    private SearchSteps searchSteps;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private ProductSteps productSteps;

    @Test
    public void addProductsToCart(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        productSteps.addThreeProductToCart();

    }
}
