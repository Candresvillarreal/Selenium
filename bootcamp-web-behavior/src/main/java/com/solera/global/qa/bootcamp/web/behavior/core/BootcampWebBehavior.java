package com.solera.global.qa.bootcamp.web.behavior.core;

import com.solera.global.qa.bootcamp.web.behavior.core.behaviour.cart.BehaviourCart;
import com.solera.global.qa.bootcamp.web.behavior.core.behaviour.inventory.BehaviourInventory;
import com.solera.global.qa.bootcamp.web.behavior.core.behaviour.login.BehaviourLogOut;
import com.solera.global.qa.bootcamp.web.behavior.core.behaviour.login.BehaviourLogin;
import com.solera.global.qa.core.framework.test.TestCaseReport;
import com.solera.global.qa.web.framework.web.WebBehaviorBase;

public class BootcampWebBehavior extends WebBehaviorBase {

    public BootcampWebBehavior(TestCaseReport testCaseReport) {

        super(testCaseReport);
    }

    public BehaviourLogin behaviourLogin() {

        return new BehaviourLogin(testCaseReport, browser);
    }

    public BehaviourLogOut behaviourLogOut() {

        return new BehaviourLogOut(testCaseReport, browser);
    }

    public BehaviourInventory behaviourInventory() {

        return new BehaviourInventory(testCaseReport, browser);
    }

    public BehaviourCart behaviourCart() {
        return new BehaviourCart(testCaseReport, browser);
    }

}
