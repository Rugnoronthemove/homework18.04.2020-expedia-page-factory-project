package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class FlightSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(FlightSearchPage.class.getName());

    @FindBy(id = "flight-origin-hp-flight")
    WebElement _flyingFrom;

    @FindBy(id = "flight-destination-hp-flight")
    WebElement _goingTo;

    @FindBy(id = "flight-departing-hp-flight")
    WebElement _departingDate;

    @FindBy(id = "flight-returning-hp-flight")
    WebElement _returningDate;

    @FindBy(xpath = "//form[@id='gcw-flights-form-hp-flight']//div//label//button")
    WebElement _searchBtn;

    @FindBy(css = "h1.wizard-tabs")
    WebElement _welcomeText;

    public void sendTextToFlyingFrom(String flyFrm) {
        Reporter.log(" Enter flying from: " + flyFrm + " in the flying from field " + _flyingFrom.toString() + "<br>");
        sendTextToElement(_flyingFrom, flyFrm);
        log.info(" Enter flying from: " + flyFrm + " in the flying from field " + _flyingFrom.toString());
    }

    public void sendTextToGoingTo(String goTo) {
        Reporter.log(" Enter going to: " + goTo + " in the going to field " + _goingTo.toString() + "<br>");
        sendTextToElement(_goingTo, goTo);
        log.info(" Enter going to: " + goTo + " in the going to field " + _goingTo.toString());
    }

    public void sendTextToDepartingDate(String departDate) {
        Reporter.log(" Enter departure date: " + departDate + " in the departure date field " + _departingDate.toString() + "<br>");
        sendTextToElement(_departingDate, departDate);
        log.info(" Enter departure date: " + departDate + " in the departure field " + _departingDate.toString());
    }

    public void sendTextToReturningDate(String returnDate) {
        Reporter.log(" Enter returning date " + returnDate + " in the returning date field " + _returningDate.toString() + "<br>");

        getElement(_returningDate).sendKeys(Keys.CONTROL, "a");
        getElement(_returningDate).sendKeys(Keys.DELETE);

        sendTextToElement(_returningDate, returnDate);

        log.info(" Enter returning date " + returnDate + " in the returning date field " + _returningDate.toString());
    }

    public void clickOnSearchBtn() {
        Reporter.log(" Click on search button " + _searchBtn.toString() + "<br>");
        waitUntilElementToBeClickable(_searchBtn, 20);
        clickOnElement(_searchBtn);
        log.info(" Click on search button " + _searchBtn.toString());
    }

    public void verifySearchFlightsText(String fltTxt) {
        Reporter.log(" Verify text: " + fltTxt + " is displayed on search flights page " + _welcomeText.toString() + "<br>");
        verifyTextAssertMethod(_welcomeText, fltTxt);
        log.info(" Verify text: " + fltTxt + " is displayed on search flights page " + _welcomeText.toString());
    }

}
