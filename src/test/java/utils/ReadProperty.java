package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public static String readConfig(String key) {
		FileReader reader;
		Properties prop;
		String value = null;
		try {
			reader = new FileReader("./config.properties");
			prop = new Properties();	
            prop.load(reader);
            value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return value;
	}
	
	public static String readObject(String fileName, String key) {
		FileReader reader;
		Properties prop;
		String value = null;
		try {
			reader = new FileReader("./ObjectRepositories/"+fileName+".properties");
			prop = new Properties();	
            prop.load(reader);
            value = prop.getProperty(key);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return value;		
	}

}