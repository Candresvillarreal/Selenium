package com.solera.global.qa.bootcamp.web.behavior.pages.loginpage;

import com.solera.global.qa.web.framework.web.Browser;
import com.solera.global.qa.web.framework.web.Page;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(css = "div.cart_item")
    private List<WebElement> shoppingCartProducts;



    public CartPage(Browser browser) {
        super(browser);
    }

    //Method that returns if the checkout button is present in the current page
    public boolean isCheckoutPresent() {
        return waitForElementToBeClickable(checkoutButton);
    }

}
