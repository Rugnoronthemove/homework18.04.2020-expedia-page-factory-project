package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class HotelsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HotelsPage.class.getName());

    @FindBy(css = "h1.wizard-tabs")
    WebElement _welcomeText;

    public void verifyHotelsPageText(String pgTxt) {
        Reporter.log(" Verify text: "+pgTxt+" is displayed on hotels page " + _welcomeText.toString() + "<br>");
        verifyTextAssertMethod(_welcomeText,pgTxt);
        log.info(" Verify text: "+pgTxt+" is displayed on hotels page " + _welcomeText.toString());
    }
}
