package basetestpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import utilities.ExcelReader;

public class BaseTest {
	
	public Properties config = new Properties();
 private FileInputStream fis;
 public static ExcelReader excel = new ExcelReader(".\\src\\test\\resources\\Excel\\Book1.xlsx");
 
@BeforeSuite
	public void setUp() throws IOException {
	

	try {
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {

		config.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		RestAssured.baseURI=config.getProperty("baseURI");
		RestAssured.basePath=config.getProperty("basePath");
		
	}
	@AfterSuite
	public void tearDown() {
		
		
	}
}
