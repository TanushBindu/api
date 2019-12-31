package Test_request;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class Post_request extends Test_Base
{
	RequestSpecification httpRequest;
	Response response;
	
	String emp_name = RestUtils.emp_name();
	String emp_job = RestUtils.emp_job();
	@Test
	void put_emp_data()
	{
		RestAssured.baseURI = "https://reqres.in";
		httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		JSONObject requestparams = new JSONObject();
		requestparams.put("name", emp_name);
		requestparams.put("job", emp_job);
		httpRequest.body(requestparams.toJSONString());
		response = httpRequest.request(Method.PUT,"/api/users");
		int status_code = response.getStatusCode();
		System.out.println(status_code);
	}	
}
