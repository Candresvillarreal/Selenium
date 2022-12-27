package com.solera.global.qa.bootcamp.web.behavior.pages.loginpage;

import com.solera.global.qa.web.framework.data.EnvironmentProperties;
import com.solera.global.qa.web.framework.web.Browser;
import com.solera.global.qa.web.framework.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    private static final String LOGIN_URL = EnvironmentProperties.getEnvironmentUrl();

    @FindBy(id = "user-name")
    private WebElement userNameInput;
    @FindBy(id = "password")
    private WebElement userPasswordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(Browser browser) {
        super(browser);
    }
    //Actions needed to Login

    //Method to open de browser
    public void openLoginPage() {
        openURL(LOGIN_URL);
    }

    //Method to send user credentials
    public void sendUserCredentials(String userName, String password) {
        click(userNameInput);
        sendKeys(userNameInput, userName);
        click(userPasswordInput);
        sendKeys(userPasswordInput, password);
    }

    //Method to click on Login Button
    public void clickLoginButton() {
        click(loginButton);
    }

    //Method to find if the Login Button is present in the current page
    public boolean loginButtonIsPresent() {
        return loginButton.isDisplayed();
    }

}