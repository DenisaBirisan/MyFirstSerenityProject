package org.fasttrackit.steps.serenity;

import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.fasttrackit.utils.BaseTest;

public class ProductSteps extends BaseTest {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private LoginSteps loginSteps;
    private ProductPage productPage;
    private SearchSteps searchSteps;

    public void addFirstProductsToCart() {
        searchResultsPage.clickViewDetailsFirstProduct();
        productPage.clickChooseColorButton();
        productPage.clickChooseSizeButton();
        productPage.clickAddToCartButton();
    }
    public void addSecondProductToCart() {
        searchResultsPage.clickViewDetailsSecondProduct();
        productPage.clickChooseColorButton();
        productPage.clickChooseSizeButton();
        productPage.clickAddToCartButton();
    }
    public void addThirdProductToCart(){
        searchResultsPage.clickViewDetailsThirdProduct();
        productPage.clickChooseColorButton();
        productPage.clickChooseSizeButton();
        productPage.clickAddToCartButton();
    }

    public void addThreeProductToCart(){
        searchSteps.search("Shirt");
        addFirstProductsToCart();
        searchSteps.search("Shirt");
        addSecondProductToCart();
        searchSteps.search("Shirt");
        addThirdProductToCart();

    }
}
