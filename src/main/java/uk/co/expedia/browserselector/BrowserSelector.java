package uk.co.expedia.browserselector;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import uk.co.expedia.basepage.BasePage;

public class BrowserSelector extends BasePage {

    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            log.info("Launching Chrome Browser");
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            log.info("Launching FireFox Browser");
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("opera")) {
            log.info("Launching Opera Browser");
            System.setProperty("webdriver.opera.driver", projectPath + "/drivers/operadriver.exe");
            driver = new OperaDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            log.info("Launching IE Browser");
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer2.40.0.exe");
            driver = new InternetExplorerDriver();
        } else {
            log.info("Wrong Browser Selected");
            System.out.println("Wrong browser selected");
        }
    }

}
