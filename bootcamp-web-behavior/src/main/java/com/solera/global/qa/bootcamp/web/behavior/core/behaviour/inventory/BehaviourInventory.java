package com.solera.global.qa.bootcamp.web.behavior.core.behaviour.inventory;

import static org.apache.logging.log4j.core.impl.ThrowableFormatOptions.CLASS_NAME;

import com.solera.global.qa.bootcamp.web.behavior.pages.loginpage.InventoryPage;
import com.solera.global.qa.core.framework.test.TestCaseReport;
import com.solera.global.qa.jlogger.utils.LogStatus;
import com.solera.global.qa.web.framework.web.Browser;

public class BehaviourInventory {

    private Browser browser;
    private TestCaseReport testCaseReport;

    public BehaviourInventory(TestCaseReport testCaseReport, Browser browser) {
        this.testCaseReport = testCaseReport;
        this.browser = browser;
    }

    //Method that returns if the Shopping cart exists in the current page
    public boolean isShoppingCartPresent() {
        final String METHOD_NAME = "shoppingCartPresent";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        return inventoryPage.isShoppingCartPresent();
    }

    //Method that returns if one or more product images are repeated in the current page
    public boolean isImageRepeated() {
        final String METHOD_NAME = "isImageRepeated";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        return inventoryPage.isImageRepeated();
    }

    //Method to open the Shopping cart
    public void openShoppingCart() {
        final String METHOD_NAME = "openShoppingCart";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        inventoryPage.openShoppingCart();
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
    }

    //Method to add all the products to the shopping cart
    public void addProducts() {
        final String METHOD_NAME = "addProducts";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        inventoryPage.addProductsShoppingCart();
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
    }

    //Method to get the number of products added to the shopping cart
    public String productsAddedShoppingCart() {
        final String METHOD_NAME = "productsAddedShoppingCart";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        return inventoryPage.productsAddedShoppingCart();
    }

    //Method to compare the result returned from addProducts() and productsAddedShoppingCart()
    public boolean compareAddedProducts() {
        final String METHOD_NAME = "compareAddedProducts";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        InventoryPage inventoryPage = new InventoryPage(browser);
        return inventoryPage.compareAddedProducts();
    }

}
