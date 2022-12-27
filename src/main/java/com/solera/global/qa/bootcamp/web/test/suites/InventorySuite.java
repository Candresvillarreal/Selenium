package com.solera.global.qa.bootcamp.web.test.suites;

import com.solera.global.qa.bootcamp.web.test.cases.inventory.Inventory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Inventory.class,

})
public class InventorySuite {

}
