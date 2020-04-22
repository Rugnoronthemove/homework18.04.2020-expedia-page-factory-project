package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class AccountPage extends Utility {

        private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

        @FindBy(id = "header-account-signin-button")
        WebElement _signInBtn;

        @FindBy(id = "header-exclusive-deals")
        WebElement _pageText;

        public void clickOnSignInBtn() {
            Reporter.log(" Click on sign in button: " + _signInBtn.toString() + "<br>00");
            clickOnElement(_signInBtn);
            log.info(" Click on sign in button: " + _signInBtn.toString());
        }

        public void mouseHoverOnSignInBtn() {
            Reporter.log(" Mouse hover on sign in button: " + _signInBtn.toString() + "<br>");
            mouseHover(_signInBtn);
            log.info(" Mouse hover on sign in button: " + _signInBtn.toString());
        }

        public void verifyAccountPageText(String pgTxt) {
            Reporter.log(" Verify text: " + pgTxt + " is displayed on account page " + _pageText.toString() + "<br>");
            verifyTextAssertMethod(_pageText, pgTxt);
            log.info(" Verify text: " + pgTxt + "  is displayed on account page " + _pageText.toString());
        }

}
