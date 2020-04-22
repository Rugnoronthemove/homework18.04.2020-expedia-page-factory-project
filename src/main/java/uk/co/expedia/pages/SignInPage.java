package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends HomePage {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(id = "gss-signin-email")
    WebElement _emailField;

    @FindBy(id = "gss-signin-password")
    WebElement _passwordField;

    @FindBy(id = "gss-signin-submit")
    WebElement _signInTab;

    @FindBy(id = "gss-signin-login-google-button")
    WebElement _pageText;

    @FindBy(id = "gss-signin-incorrect-email-or-password")
    WebElement _errorMessage;


    public void sendTextToEmailField(String username) {
        Reporter.log(" Enter email: " + username + " to email field " + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, username);
        log.info(" Enter email: " + username + " to email field " + _emailField.toString());
    }

    public void sendTextToPasswordField(String pwd) {
        Reporter.log(" Enter password: " + pwd + " to password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, pwd);
        log.info(" Enter password: " + pwd + " to password field " + _passwordField.toString());
    }

    public void clickOnSignInTab() {
        Reporter.log(" Click on sign in tab: " + _signInTab.toString() + "<br>");
        clickOnElement(_signInTab);
        log.info(" Click on sign in tab: " + _signInTab.toString());
    }

    public void verifySignInPageText(String pgTxt) {
        Reporter.log(" Verify text: " + pgTxt + " is dispalyed on sign in page " + _pageText.toString() + "<br>");
        verifyTextAssertMethod(_pageText, pgTxt);
        log.info(" Verify text: " + pgTxt + " is dispalyed on sign in page " + _pageText.toString());
    }

    public void verifyErrorMessage(String errMsg) {
        Reporter.log(" Verify error message: " + errMsg + " is displayed " + _errorMessage.toString() + "<br>");
        verifyTextAssertMethod(_errorMessage, errMsg);
        log.info(" Verify error message: " + errMsg + " is displayed " + _errorMessage.toString());
    }

}
