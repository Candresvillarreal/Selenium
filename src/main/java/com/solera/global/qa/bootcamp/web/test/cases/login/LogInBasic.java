package com.solera.global.qa.bootcamp.web.test.cases.login;

import com.solera.global.qa.bootcamp.web.behavior.data.types.User;
import com.solera.global.qa.bootcamp.web.test.categories.DebugCategory;
import com.solera.global.qa.bootcamp.web.test.core.BootcampWebTestBase;
import com.solera.global.qa.bootcamp.web.test.data.UsersDetails;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class LogInBasic extends BootcampWebTestBase {

    protected static UsersDetails usersDetails = new UsersDetails();

    User standardUser;
    User standardUserWithIncorrectPassword;
    User standardUserWithOutPassword;
    User lockedOutUser;
    User problemUser;
    User performanceGlitchUser;


    public LogInBasic() {
        standardUser = usersDetails.getUser().getStandardUser();
        standardUserWithIncorrectPassword = usersDetails.getUser().getStandardUserWithIncorrectPassword();
        standardUserWithOutPassword = usersDetails.getUser().getStandardUserWithOutPassword();
        lockedOutUser = usersDetails.getUser().getLockedOutUser();
        problemUser = usersDetails.getUser().getProblemUser();
        performanceGlitchUser = usersDetails.getUser().getPerformanceGlitchUser();
    }

    //Testing login with Standard User. Correct User data provided.  Expected result: true
    @Category(DebugCategory.class)
    @Test
    public void loginStandardUser() {
        initiateTemplateWebTest("Login Standard User");
        behavior.behaviourLogin().loginUser(standardUser);
        testCaseReport.assertEquals("Login Succesful", true, behavior.behaviourInventory().isShoppingCartPresent());
        behavior.behaviourLogOut().loginOut();
        behavior.closeBrowser();
    }

    //Testing login with standardUserWithIncorrectPassword. Incorrect User data provided.  Expected result: false
    @Category(DebugCategory.class)
    @Test
    public void loginStandardUserWithIncorrectPassword() {
        initiateTemplateWebTest("Login Standard User With Incorrect Password");
        behavior.behaviourLogin().loginUser(standardUserWithIncorrectPassword);
        testCaseReport.assertEquals("Incorrect password", false, behavior.behaviourInventory().isShoppingCartPresent());
        behavior.closeBrowser();
    }

    //Testing login with standardUserWithOutPassword. Incorrect User data provided.  Expected result: false
    @Category(DebugCategory.class)
    @Test
    public void loginStandardUserWithOutPassword() {
        initiateTemplateWebTest("Login Standard User");
        behavior.behaviourLogin().loginUser(standardUserWithOutPassword);
        testCaseReport.assertEquals("No password", false, behavior.behaviourInventory().isShoppingCartPresent());
        behavior.closeBrowser();
    }

    //Testing login with using the locked user.  Expected result: false
    @Category(DebugCategory.class)
    @Test
    public void loginLockedUser() {
        initiateTemplateWebTest("Login Locked User");
        behavior.behaviourLogin().loginUser(lockedOutUser);
        testCaseReport.assertEquals("Locked User", false, behavior.behaviourInventory().isShoppingCartPresent());
        behavior.closeBrowser();
    }

    //Testing the problem user. Correct login is expected as well as find repeated images. Expected result: true
    @Category(DebugCategory.class)
    @Test
    public void loginProblemUser() {
        initiateTemplateWebTest("Login Problem User");
        behavior.behaviourLogin().loginUser(problemUser);
        testCaseReport.assertEquals("Inventory page error", true, behavior.behaviourInventory().isImageRepeated());
        behavior.closeBrowser();
    }

    //Testing the standard user looking for repeated product images once the login is done. Expected result: false
    @Category(DebugCategory.class)
    @Test
    public void loginStandardUserLookingForRepeatedImages() {
        initiateTemplateWebTest("Login Standard user looking for repeated images");
        behavior.behaviourLogin().loginUser(standardUser);
        testCaseReport.assertEquals("Inventory page error", false, behavior.behaviourInventory().isImageRepeated());
        behavior.closeBrowser();
    }

}


