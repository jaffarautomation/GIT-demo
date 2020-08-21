package testing;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

	


	public void onStart(ITestContext context) {

	System.out.println(context.getName() + "Started");
	}

	public void onFinish(ITestContext context) {

		System.out.println(context.getName() + "End");
		
		

	}

	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName() +"Started");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() +"Success");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() +"Failed");

		

	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println(result.getMethod().getMethodName() +"Skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());

	}

}
