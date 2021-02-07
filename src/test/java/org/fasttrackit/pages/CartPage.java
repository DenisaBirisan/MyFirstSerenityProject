package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {
    @FindBy(css = ".header-minicart a.skip-cart")
    private WebElementFacade cartButton;

    public void clickCartButton(){
        clickOn(cartButton);
    }

}
