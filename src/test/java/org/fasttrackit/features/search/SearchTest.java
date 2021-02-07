package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.SearchResultsPage;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.EnvironmentConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps SearchSteps;
    @Steps
    private LoginSteps loginSteps;


    @Test
    public void searchProductTest(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
    //    SearchSteps.setSearchField("necklace");
    //    SearchSteps.clickSearchButton();
        SearchSteps.search("shirt");
        SearchSteps.verifyIfProductIsDisplayed("SLIM FIT DOBBY OXFORD SHIRT");
    }

    @Test
    public void orderProductsInAscendingOrder(){
        loginSteps.login(EnvironmentConstants.USER_EMAIL,EnvironmentConstants.USER_PASS);
        SearchSteps.orderProductsInAscendingOrder("shirt");
        SearchSteps.verifyPriceListIsInAscendingOrder();


    }
}
