package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(css = ".add-to-cart-buttons")
    private WebElementFacade addToCartButton;
    @FindBy(css=".swatch-label [src=\"http://testfasttrackit.info/magento-test/media/catalog/swatches/1/21x21/media/indigo.png\"]")
    private WebElementFacade chooseColor;
    @FindBy(id="swatch79")
    private WebElementFacade chooseSize;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void clickChooseColorButton(){
        clickOn(chooseColor);
    }
    public void clickChooseSizeButton(){
        clickOn(chooseSize);
    }



}
