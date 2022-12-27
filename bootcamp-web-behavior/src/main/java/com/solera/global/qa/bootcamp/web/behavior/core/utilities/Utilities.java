package com.solera.global.qa.bootcamp.web.behavior.core.utilities;

import com.solera.global.qa.web.framework.web.Browser;
import com.solera.global.qa.web.framework.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Utilities extends Page {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutButton;

    public Utilities(Browser browser) {
        super(browser);
    }

    //Method to click the Menu button
    public void clickMenu() {

        click(menuButton);
    }

    //Method to click the Logout button
    public void clickLogOut() {

        click(logOutButton);
    }






}
