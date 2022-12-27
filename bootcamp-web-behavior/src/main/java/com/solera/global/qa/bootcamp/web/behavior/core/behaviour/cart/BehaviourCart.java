package com.solera.global.qa.bootcamp.web.behavior.core.behaviour.cart;

import static org.apache.logging.log4j.core.impl.ThrowableFormatOptions.CLASS_NAME;

import com.solera.global.qa.bootcamp.web.behavior.pages.loginpage.CartPage;
import com.solera.global.qa.core.framework.test.TestCaseReport;
import com.solera.global.qa.jlogger.utils.LogStatus;
import com.solera.global.qa.web.framework.web.Browser;

public class BehaviourCart {

    private Browser browser;
    private TestCaseReport testCaseReport;

    public BehaviourCart(TestCaseReport testCaseReport, Browser browser) {
        this.testCaseReport = testCaseReport;
        this.browser = browser;
    }

    //Method that returns if the checkout button is present in the current page
    public boolean isCheckoutPresent() {
        final String METHOD_NAME = "isCheckoutPresent";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        CartPage cartPage = new CartPage(browser);
        return cartPage.isCheckoutPresent();

    }
}
