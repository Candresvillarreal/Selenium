package com.solera.global.qa.bootcamp.web.behavior.core.behaviour.login;

import static org.apache.logging.log4j.core.impl.ThrowableFormatOptions.CLASS_NAME;

import com.solera.global.qa.bootcamp.web.behavior.data.types.User;
import com.solera.global.qa.bootcamp.web.behavior.pages.loginpage.LoginPage;
import com.solera.global.qa.core.framework.test.TestCaseReport;
import com.solera.global.qa.jlogger.utils.LogStatus;
import com.solera.global.qa.web.framework.web.Browser;

public class BehaviourLogin {

    private Browser browser;
    private TestCaseReport testCaseReport;

    public BehaviourLogin(TestCaseReport testCaseReport, Browser browser) {
        this.testCaseReport = testCaseReport;
        this.browser = browser;
    }

    //Method to login using the LoginPage methods
    public void loginUser(User user) {
        final String METHOD_NAME = "loginUser";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        LoginPage logInPage = new LoginPage(browser);
        logInPage.openLoginPage();
        logInPage.sendUserCredentials(user.getUserName(), user.getPassword());
        logInPage.clickLoginButton();
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
    }

    //Method to check if the login button is present in the current page
    public boolean loginButtonIsPresent() {
        final String METHOD_NAME = "loginButtonIsPresent";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        LoginPage logInPage = new LoginPage(browser);
        return logInPage.loginButtonIsPresent();

    }

}
