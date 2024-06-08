package week4.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String getObject(String fileName, String key) {
		String value = null;
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("src/test/resources/ObjectRepositories/"+fileName+".properties"));
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return value;
	}

}