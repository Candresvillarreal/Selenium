package com.solera.global.qa.bootcamp.web.test.cases.inventory;

import com.solera.global.qa.bootcamp.web.behavior.data.types.User;
import com.solera.global.qa.bootcamp.web.test.categories.DebugCategory;
import com.solera.global.qa.bootcamp.web.test.core.BootcampWebTestBase;
import com.solera.global.qa.bootcamp.web.test.data.UsersDetails;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Inventory extends BootcampWebTestBase {

    protected static UsersDetails usersDetails = new UsersDetails();

    User standardUser;
    User problemUser;

    public Inventory() {
        standardUser = usersDetails.getUser().getStandardUser();
        problemUser = usersDetails.getUser().getProblemUser();
    }

    /*Test if the products added to the shopping cart are the same that the products showed in the shopping cart badge.
     *Using Standard user. Expected result: true
     */
    @Category(DebugCategory.class)
    @Test
    public void addProductsShoppingCartUsingStandardUser() {
        initiateTemplateWebTest("addProductsShoppingCartUsingStandardUser");
        behavior.behaviourLogin().loginUser(standardUser);
        testCaseReport.assertEquals("Products Added", true, behavior.behaviourInventory().compareAddedProducts());
        behavior.behaviourLogOut().loginOut();
        behavior.closeBrowser();
    }

    /*Test if the products added to the shopping cart are the same that the products showed in the shopping cart badge.
     *Using Problem user. Expected result: false (6 products added but only 3 are showed in the shopping cart badge.
     */
    @Category(DebugCategory.class)
    @Test
    public void addProductsShoppingCartUsingProblemUser() {
        initiateTemplateWebTest("addProductsShoppingCartUsingSProblemUser");
        behavior.behaviourLogin().loginUser(problemUser);
        testCaseReport.assertEquals("Products Added", false, behavior.behaviourInventory().compareAddedProducts());
        behavior.closeBrowser();
    }

}
