

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apitest1 {
	
	@Test
	public void aoitest() {
		
		 RestAssured.baseURI = "https://reqres.in/api/users/";
		 
	        //Define the specification of request. Server is specified by baseURI above.
	        RequestSpecification httpRequest = RestAssured.given();
	 
	        //Makes calls to the server using Method type.
	        Response response = httpRequest.request(Method.GET, "2");
	 
	        //Checks the Status Code
	        int statusCode = response.getStatusCode();
	        System.out.println(statusCode);
		
	}

}
