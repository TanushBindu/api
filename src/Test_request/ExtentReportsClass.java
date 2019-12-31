package Test_request;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportsClass
{
	ExtentReporter extent;
	ExtentTest log ;
	@BeforeMethod
	public void startTest()
	{
		extent = new ExtentReports("./Reports/ExtentReport.html",true);
		extent.addSystemInfo("Host name", "TESTYANTRA");
		extent.addSystemInfo("Name", "Tanush Kumar");
		extent.addSystemInfo("EMV", "Tanush");
		extent.loadConfig(new File(System.getProperty("./config/extent_config.xml")));
	}
	@Test
	public void pass_test()
	{
		log = extent.startTest("passTest");
		Assert.assertTrue(true);
		log.log(LogStatus.PASS, "Test case pass");
	}
	public void fail_test()
	{
		log = extent.startTest("failTest");
		Assert.assertTrue(false);
		log.log(LogStatus.FAIL, "Test case pass");
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			log.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			log.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(LogStatus.SKIP, "Test Case skip is "+result.getName());
			log.log(LogStatus.SKIP, "Test Case skip is "+result.getThrowable());
		}
		else
		{
			log.log(LogStatus.PASS, "Test Case pass is "+result.getName());
			log.log(LogStatus.PASS, "Test Case pass is "+result.getThrowable());
		}
		extent.endTest(log);
	}
	@AfterTest
	public void tearDown()
	{
		extent.flush();
		extent.close();
	}
}