package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
	config.load(fis);	
	}

}
