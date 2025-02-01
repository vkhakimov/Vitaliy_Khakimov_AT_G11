package classwork.day22;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestngListener implements ITestListener {
    //    runId = 2364
    public void onTestSuccess(ITestResult result) {
        Result testResult = new Result(1);
        TestRailReporter.reportResult("2364", result.getMethod().getDescription(), testResult);
    }

    public void onTestFailure(ITestResult result) {
        Result testResult = new Result(5);
        TestRailReporter.reportResult("2364", result.getMethod().getDescription(), testResult);
    }
}
