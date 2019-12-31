package Test_request;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class EXT 
{
	static ExtentReports extent;
	public static void main(String[] args) 
	{
		ExtentHtmlReporter htmpextent_report = new ExtentHtmlReporter("./jars/API.html");
			extent = new ExtentReports();
		extent.attachReporter(htmpextent_report);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.log(Status.PASS, "This step shows usage of log(status, details)");
        test.log(Status.FAIL, "This step shows usage of log(status, details)");
        test.log(Status.SKIP, "This step shows usage of log(status, details)");
	}
}
