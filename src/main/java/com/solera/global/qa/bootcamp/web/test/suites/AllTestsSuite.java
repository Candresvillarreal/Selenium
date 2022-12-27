package com.solera.global.qa.bootcamp.web.test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LogInSuite.class,
        LogOutSuite.class,
        CartSuite.class,
        InventorySuite.class
})
public class AllTestsSuite {

}