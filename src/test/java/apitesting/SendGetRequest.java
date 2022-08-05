package apitesting;

import static io.restassured.RestAssured.*;


import io.restassured.response.Response;

public class SendGetRequest {
public static String token = "sk_test_51KVcLYSJq1W2leYcgaGfEEtRhJNj5rvnpshyWYAu0CQ6UazqOgSP29sXPSj6c8qODoUNj8eT0CNm2w5Fv9evRhsv00tOI2pRVw";

	/*Set Authentication-- basic auth/ bearer token using headers
	 * 
	 * 
	 * 
	 */

public static void main(String[] args) {
		// TODO Auto-generated method stub

Response response = given().auth().basic(token, "").get("https://api.stripe.com/v1/customers");
//response.prettyPrint();
String jsonResponse = response.asString();
System.out.print(jsonResponse);
int statCode = response.statusCode();
System.out.print(statCode);

//	given().contentType(ContentType.JSON);
//given().contentType("application/json");
//given().header("content-type","application/json").auth().basic(userName, password);
	}

}
