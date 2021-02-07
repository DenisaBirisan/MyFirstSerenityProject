package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends PageObject {
    @FindBy(css = ".category-products .item.last")
    private List<WebElementFacade> productsList;

    @FindBy(id = ".special-price")
    private List<WebElementFacade> productsPriceList;

    @FindBy(css = ".actions a[href^=\"http://testfasttrackit.info/magento-test/core-striped-sport-shirt-652.html\"]")
    private  WebElementFacade viewDetailsFirstProduct;

    @FindBy(css = ".actions a[href=\"http://testfasttrackit.info/magento-test/plaid-cotton-shirt-730.html\"]")
    private WebElementFacade viewDetailsSecondProduct;

    @FindBy(css = ".actions a[href=\"http://testfasttrackit.info/magento-test/slim-fit-dobby-oxford-shirt-707.html\"]")
    private WebElementFacade viewDetailsThirdProduct;

    public boolean isProductDisplayed(String productName) {
        for (WebElementFacade webElementFacade : productsList) {
            if (webElementFacade.findElement(By.cssSelector(".product-name")).getText().equals(productName)) {
                return true;
            }
        }
        return false;
    }



    public List<Integer> firstAndLastElement;
    public List orderProductsInAscendingOrder(){
        Integer price=Integer.valueOf(productsPriceList.get(0).getText());
        Integer price2;
        Integer x;
        for (WebElementFacade webElementFacade : productsPriceList) {
            for (int i = 1; i <= productsPriceList.size() - 1; i++) {
                price2 = Integer.valueOf(productsPriceList.get(i).getText());
                if (price > price2) {
                    x = price;
                    price = price2;
                    price2 = x;
                }
            }
        }
        firstAndLastElement.add(Integer.valueOf((productsPriceList.get(0).getText())));
        firstAndLastElement.add(Integer.valueOf(productsPriceList.get(productsPriceList.size()).getText()));
        return firstAndLastElement;
    }

    public boolean verifyPriceListIsInAscendingOrder(){
        List<Integer> firstLastPrice;
        firstLastPrice=orderProductsInAscendingOrder();
        if (firstLastPrice.get(0) <firstLastPrice.get(1)){
            return true;
        }
        return false;
    }


    public void clickViewDetailsFirstProduct(){
        clickOn(viewDetailsFirstProduct);
    }
    public void clickViewDetailsSecondProduct() {clickOn(viewDetailsSecondProduct);}
    public void clickViewDetailsThirdProduct() {clickOn(viewDetailsThirdProduct);}










}

