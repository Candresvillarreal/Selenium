package com.solera.global.qa.bootcamp.web.behavior.core.behaviour.login;

import static org.apache.logging.log4j.core.impl.ThrowableFormatOptions.CLASS_NAME;

import com.solera.global.qa.bootcamp.web.behavior.core.utilities.Utilities;
import com.solera.global.qa.core.framework.test.TestCaseReport;
import com.solera.global.qa.jlogger.utils.LogStatus;
import com.solera.global.qa.web.framework.web.Browser;

public class BehaviourLogOut {

    private Browser browser;
    private TestCaseReport testCaseReport;

    public BehaviourLogOut(TestCaseReport testCaseReport, Browser browser) {
        this.testCaseReport = testCaseReport;
        this.browser = browser;
    }

    //Method to execute the logout once the user is logged
    public void loginOut() {
        final String METHOD_NAME = "loginOut";
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
        Utilities utility = new Utilities(browser);
        utility.clickMenu();
        utility.clickLogOut();
        testCaseReport.logMessage(LogStatus.PASS, CLASS_NAME, METHOD_NAME);
    }

}
