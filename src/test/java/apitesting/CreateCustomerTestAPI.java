package apitesting;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basetestpack.BaseTest;
import io.restassured.response.Response;
import utilities.DataUtil;

public class CreateCustomerTestAPI extends BaseTest {


	
	@Test(dataProviderClass=DataUtil.class,dataProvider="getData")
	 public void ValidateCreateCustomerAPI(String name, String email, String description) {
		
	Response response = given().auth().basic(config.getProperty("validSecretKey"), "").formParam("email", email).formParam("description", description).post(config.getProperty("customerEndPoint"));
	
response.prettyPrint();

System.out.println(response.statusCode());
}
	
	
	@Test(dataProviderClass=DataUtil.class,dataProvider="getData")
	 public void InvalidateCreateCustomerAPI(String name, String email, String description) {
		
	Response response = given().auth().basic(config.getProperty("invalidSecretKey"), "").formParam("email", email).formParam("description", description).post(config.getProperty("customerEndPoint"));
	
response.prettyPrint();

System.out.println(response.statusCode());
}


	
}