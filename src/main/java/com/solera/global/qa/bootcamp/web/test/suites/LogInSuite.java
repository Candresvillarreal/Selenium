package com.solera.global.qa.bootcamp.web.test.suites;

import com.solera.global.qa.bootcamp.web.test.cases.login.LogInBasic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LogInBasic.class,

})
public class LogInSuite {

}
