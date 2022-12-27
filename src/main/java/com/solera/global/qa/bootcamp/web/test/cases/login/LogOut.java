package com.solera.global.qa.bootcamp.web.test.cases.login;

import com.solera.global.qa.bootcamp.web.behavior.data.types.User;
import com.solera.global.qa.bootcamp.web.test.categories.DebugCategory;
import com.solera.global.qa.bootcamp.web.test.core.BootcampWebTestBase;
import com.solera.global.qa.bootcamp.web.test.data.UsersDetails;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LogOut extends BootcampWebTestBase {

    protected static UsersDetails usersDetails = new UsersDetails();

    User standardUser;

    public LogOut() {
        standardUser = usersDetails.getUser().getStandardUser();
    }

    //Logout using the Standard User.  Expected result: true
    @Category(DebugCategory.class)
    @Test
    public void logOut() {
        initiateTemplateWebTest("Logout");
        behavior.behaviourLogin().loginUser(standardUser);
        behavior.behaviourLogOut().loginOut();
        testCaseReport.assertEquals("Logout successful", true, behavior.behaviourLogin().loginButtonIsPresent());
        behavior.closeBrowser();
    }
}
