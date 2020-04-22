package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.FlightSearchPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.HotelsPage;
import uk.co.expedia.pages.SearchResultPage;
import uk.co.expedia.resources.testdata.TestData;
import uk.co.expedia.testbase.TestBase;

public class FlightTest extends TestBase {

    HomePage homePage;
    FlightSearchPage flightSearchPage;
    SearchResultPage searchResultPage;
    HotelsPage hotelsPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        flightSearchPage = new FlightSearchPage();
        searchResultPage = new SearchResultPage();
        hotelsPage = new HotelsPage();
    }

    /*
     * Test 01 - user to navigate to flights hotels & car page
     */
    @Test(groups = {"Regression","Smoke","Sanity"})
    public void userShouldNavigateToHotelsPage() {
        //click on flights hotels & car page
        homePage.clickOnHotelLink();
        //verify text from hotels page
        hotelsPage.verifyHotelsPageText("Search Hotels");
    }

    /*
     * Test 02 - user to search for flights
     */
    @Test(groups = {"Regression", "Smoke"}, dataProvider = "FlightSearchDetails", dataProviderClass = TestData.class)
    public void flightSearch(String flyFrm, String goTo, String depDate, String reDate) {
        //click on flight tab
        homePage.clickOnFlightTab();
        //set flying to destination
        flightSearchPage.sendTextToFlyingFrom(flyFrm);
        //set going to destination
        flightSearchPage.sendTextToGoingTo(goTo);
        //enter departing date
        flightSearchPage.sendTextToDepartingDate(depDate);
        //enter returning date
        flightSearchPage.sendTextToReturningDate(reDate);
        //click on search button
        flightSearchPage.clickOnSearchBtn();
        //verify the same destination flight in the search results
        searchResultPage.verifyDestinationText("Select your departure to Mumbai");
    }

    /*
    * Test 03 - user should navigate to flights page
    */
    @Test(groups = {"Regression"})
    public void userShouldNavigateToFlightsPage() {
        //click on account tab
        homePage.clickOnAccountTab();
        //verify search flights text
        flightSearchPage.verifySearchFlightsText("Search Flights");
    }

}
