package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(id = "tab-flight-tab-hp")
    WebElement _flightTab;

    @FindBy(id = "primary-header-hotel")
    WebElement _hotelLink;

    @FindBy(id = "header-account-menu")
    WebElement _accountTab;


    public void clickOnFlightTab() {
        Reporter.log(" Click on flight tab: " + _flightTab.toString() + "<br>");
        clickOnElement(_flightTab);
        log.info(" Click on flight tab: " + _flightTab.toString());
    }

    public void clickOnHotelLink() {
        Reporter.log(" Click on flight hotel and car tab: " +_hotelLink.toString() + "<br>");
        clickOnElement(_hotelLink);
        log.info(" Click on flight hotel and car tab: " + _hotelLink.toString());
    }

    public void clickOnAccountTab() {
        Reporter.log(" Click on account tab: " + _accountTab.toString() + "<br>");

        clickOnElement(_accountTab);
        log.info(" Click on account tab: " + _accountTab.toString());
    }

}
