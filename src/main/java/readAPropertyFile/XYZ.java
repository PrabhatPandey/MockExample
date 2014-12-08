package readAPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class XYZ {

	public static void main(String args[]) throws FileNotFoundException, IOException {

		// Reading properties file in Java example
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("c:/jdbc.properties");

		// loading properites from properties file
		props.load(fis);

		// reading proeprty
		String username = props.getProperty("jdbc.username");
		String driver = props.getProperty("jdbc.driver");
		System.out.println("jdbc.username: " + username);
		System.out.println("jdbc.driver: " + driver);

	}
}
