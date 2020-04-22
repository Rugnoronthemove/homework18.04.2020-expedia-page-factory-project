package uk.co.expedia.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public static WebDriver driver;

    //constructor
    public BasePage() {
        //this is for pageFactory
        PageFactory.initElements(driver, this);

        //this is for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/uk/co/expedia/resources/properties/log4j.properties");
    }


}
