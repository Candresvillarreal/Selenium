package com.solera.global.qa.bootcamp.web.test.core;


import com.solera.global.qa.bootcamp.web.behavior.core.BootcampWebBehavior;
import com.solera.global.qa.core.framework.test.TestBase;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.ExternalResource;


public class BootcampWebTestBase extends TestBase {

    //Commmon variables
    protected BootcampWebBehavior behavior;
    protected static final String DEFAULT_USER = "default";


    @Rule
    public ExternalResource resource = new ExternalResource() {
        @Override
        protected void before() {
            //Leaving a blank override in case this is needed in the future
        }

        @Override
        protected void after() {
            //Leaving a blank override in case this is needed in the future
        }
    };

    protected void initiateTemplateWebTest(String testRailName) {
        setTestRailTestName(testRailName);
        behavior = new BootcampWebBehavior(testCaseReport);
    }

    @After
    public void tearDown() {
        //Leaving a blank override in case this is needed in the future
    }

}
