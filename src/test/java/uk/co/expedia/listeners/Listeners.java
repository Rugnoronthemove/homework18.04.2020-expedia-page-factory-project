package uk.co.expedia.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Utility.takeScreenShot();
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        // This step take screenshot and store in to test-output/html folder
        String screenshotName = Utility.takeScreenShot(iTestResult.getName());
        // This line required for ReportNG reports
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        //Bellow all code is for logs the screenshot to report.
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target = \"_blank\" href="+screenshotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target = \"_blank\" href="+screenshotName+"><img src="+screenshotName+" height=200 width=200></img></a>");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
