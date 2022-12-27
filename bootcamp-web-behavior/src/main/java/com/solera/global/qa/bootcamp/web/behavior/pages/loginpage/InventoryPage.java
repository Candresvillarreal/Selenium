package com.solera.global.qa.bootcamp.web.behavior.pages.loginpage;

import com.solera.global.qa.web.framework.web.Browser;
import com.solera.global.qa.web.framework.web.Page;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page {

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;
    @FindBy(css = "img.inventory_item_img")
    private List<WebElement> productsList;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;
    @FindAll({@FindBy(className = "inventory_item")})
    private List<WebElement> productsAddButton;
    @FindBy(tagName = "span")
    private WebElement shoppingCartBadge;



    public InventoryPage(Browser browser) {
        super(browser);
    }

    //Methods to verify the Login is done correctly searching if the Shopping Cart is present on the page
    public boolean isShoppingCartPresent() {
        return waitForElementToBeClickable(shoppingCart);
    }

    //Method to find if there are one or more product images repeated on the page
    public boolean isImageRepeated() {
        boolean imgRepeated = false;
        for (int i = 0; i < productsList.size() - 1; i++) {
            WebElement element = getElementFromList(productsList, i);
            String src = element.getAttribute("src");
            for (int j = i + 1; j < productsList.size(); j++) {
                WebElement element1 = getElementFromList(productsList, j);
                String src1 = element1.getAttribute("src");
                if (src.equals(src1)) {
                    imgRepeated = true;
                }
            }
        }
        return imgRepeated;
    }

    //Method to open the Shopping the cart
    public void openShoppingCart() {
        click(shoppingCartLink);
    }

    //Method to add all the products to the shopping cart
    public String addProductsShoppingCart() {
        int addedProducts = 0;
        String productsAdded = "";
        for (WebElement addButton : productsAddButton) {
            click(addButton.findElement(By.tagName("button")));
            addedProducts += 1;
            productsAdded = String.valueOf(addedProducts);
        }
        return productsAdded;
    }

    //Method to get the number of products added to the shopping cart from the shopping cart container
    public String productsAddedShoppingCart() {
        return getElement(By.tagName("span")).getText();
    }

    //Method to compare the result returned from addProductsShoppingCart() and productsAddedShoppingCart()
    public boolean compareAddedProducts() {
        String clickedButtons = addProductsShoppingCart();
        String productsAdded = productsAddedShoppingCart();
        return clickedButtons.equals(productsAdded);
    }

}
