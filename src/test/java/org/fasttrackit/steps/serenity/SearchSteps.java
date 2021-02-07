package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps  {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;


    @Step
    public void setSearchField(String text){
        homePage.setSearchField(text);
    }

    @Step
    public void clickSearchButton(){
        homePage.clickSearchButton();
    }

    @Step
    public void search(String text){
        homePage.setSearchField(text);
        homePage.clickSearchButton();
    }

    @Step
    public void verifyIfProductIsDisplayed(String productName){
        Assert.assertTrue(searchResultsPage.isProductDisplayed(productName));
    }

    @Step
    public void orderProductsInAscendingOrder(String text){


        searchResultsPage.orderProductsInAscendingOrder();
    }

    @Step
    public void verifyPriceListIsInAscendingOrder(){
        searchResultsPage.verifyPriceListIsInAscendingOrder();
    }
    @Step
    public void viewDetails(){
        searchResultsPage.clickViewDetailsFirstProduct();
        searchResultsPage.clickViewDetailsSecondProduct();
        searchResultsPage.clickViewDetailsThirdProduct();
    }

}
