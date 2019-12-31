package Test_request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;

public class Test_Base 
{
	public static RequestSpecification httpRequest;
	public static Response response;
	public String empID;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		logger = Logger.getLogger("api_tanush");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);

	}
}
