package Demo.Demomyntra;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import resource.base;

public class Listeners extends base implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");

		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		System.out.println("Test failed "+result.getName());
		Reporter.log("Test case fail");
		Reporter.log("<a href=\"/home/seema/Documents/Eclipse workspace new/Demomyntra/test-output/validtionerror.png\">Failed Screenshort</a>");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skip");

		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test failed due to time out");

		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
