package com.solera.global.qa.bootcamp.web.test.testsrun;

import com.solera.global.qa.bootcamp.web.test.categories.DebugCategory;
import com.solera.global.qa.bootcamp.web.test.suites.AllTestsSuite;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({DebugCategory.class})
@Suite.SuiteClasses({AllTestsSuite.class})
public class DebugTestsRun {

}
