package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.resources.testdata.TestData;
import uk.co.expedia.testbase.TestBase;

public class LoginTest extends TestBase {

    HomePage homePage;
    AccountPage accountPage;
    SignInPage signInPage;

    //Object created for pages
    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        accountPage = new AccountPage();
        signInPage = new SignInPage();
    }

    /*
     * Test 01 - user should navigate to sign in page
     */
    @Test(groups = {"Regression", "Sanity", "Smoke"})
    public void userShouldNavigateToAccountPage() {
        //click on account tab
        homePage.clickOnAccountTab();
        //verify text on account page
        accountPage.verifyAccountPageText("Sign in to see exclusive Member Pricing.");
    }

    /*
     * Test 02 - LoginTest - User should not login with invalid credentials
     */
    @Test(groups = {"Regression", "Smoke"},dataProvider = "LoginCredentials",dataProviderClass = TestData.class)
    public void loginTest(String email, String password) {
        //click on account tab
        homePage.clickOnAccountTab();
        //click on sign in button on account page
        accountPage.clickOnSignInBtn();
        //enter invalid username
        signInPage.sendTextToEmailField(email);
        //enter invalid password
        signInPage.sendTextToPasswordField(password);
        //click on sign in tab on sign in page
        signInPage.clickOnSignInTab();
        //verify error message You may have entered an unknown email address or an incorrect password
        signInPage.verifyErrorMessage("You may have entered an unknown email address or an incorrect password");
    }

    /*
     * Test 03 - user should navigate to sign in page
     */
    @Test(groups = {"Regression"})
    public void userShouldNavigateToSignInPage() {
        //click on account tab
        homePage.clickOnAccountTab();
        //mouse hover on sign in page
        accountPage.mouseHoverOnSignInBtn();
        //verify text on sign in page
        signInPage.verifySignInPageText("Sign In with Google");
    }

}
