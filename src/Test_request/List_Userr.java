package Test_request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
public class List_Userr extends Test_Base
{																																					
	@Test
	void get_list_user() throws IOException
	{
		LG l1 = new LG();
		ArrayList<String> endpoint = LG.Get_all_one_by_one();
		for (int i = 0; i < endpoint.size(); i++) 
		{
			ExtentReports report = new ExtentReports("./API_PROJECT/logs/tanush_extents.html");
			RestAssured.baseURI = "https://reqres.in/";
			logger.info("URL ENTERED");
			RequestSpecification httprequest = RestAssured.given();
			Response response = httprequest.request(Method.GET,endpoint.get(i));
			logger.info("Endpoint ENTERED");
			String str = response.getBody().asString();
			int status_code = response.getStatusCode();
			System.out.println(status_code);
			logger.info("status Code taken");
		}
	}
}
