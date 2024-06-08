package org.java.code.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader("./config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		System.out.println(prop.get("stage.url"));
		System.out.println(readObject("LoginPage", "username.textbox.id"));
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
