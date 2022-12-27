package com.solera.global.qa.bootcamp.web.test.cases.cart;

import com.solera.global.qa.bootcamp.web.behavior.data.types.User;
import com.solera.global.qa.bootcamp.web.test.categories.DebugCategory;
import com.solera.global.qa.bootcamp.web.test.core.BootcampWebTestBase;
import com.solera.global.qa.bootcamp.web.test.data.UsersDetails;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Cart extends BootcampWebTestBase {

    protected static UsersDetails usersDetails = new UsersDetails();

    User standardUser;

    public Cart() {
        standardUser = usersDetails.getUser().getStandardUser();
    }

    //Method to login using the Standard user, open the shopping cart, testing if it is open
    @Category(DebugCategory.class)
    @Test
    public void openShoppingCart() {
        initiateTemplateWebTest("Open shopping cart");
        behavior.behaviourLogin().loginUser(standardUser);
        behavior.behaviourInventory().openShoppingCart();
        testCaseReport.assertEquals("Accessing shopping cart", true, behavior.behaviourCart().isCheckoutPresent());
        behavior.behaviourLogOut().loginOut();
        behavior.closeBrowser();
    }

    //Method to login using the Standard user, open the shopping cart, testing if it is open and logout
    @Category(DebugCategory.class)
    @Test
    public void loginOpenShoppingCartLogout() {
        initiateTemplateWebTest("Login, open shopping cart and logout");
        behavior.behaviourLogin().loginUser(standardUser);
        testCaseReport.assertEquals("Login Succesful", true, behavior.behaviourInventory().isShoppingCartPresent());
        behavior.behaviourInventory().openShoppingCart();
        testCaseReport.assertEquals("Accessing shopping cart", true, behavior.behaviourCart().isCheckoutPresent());
        behavior.behaviourLogOut().loginOut();
        testCaseReport.assertEquals("Logout successful", true, behavior.behaviourLogin().loginButtonIsPresent());
        behavior.closeBrowser();
    }

}
