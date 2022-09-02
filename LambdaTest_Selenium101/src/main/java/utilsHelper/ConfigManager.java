package utilsHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

	private static Properties prop = null;
	private static File file = null;
	private static FileInputStream fis = null;
	
	static {
		prop = new Properties();
		file = new File("./src/main/resources/config.properties");	
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String propName) {
		String confProp = prop.getProperty(propName);
		if(confProp != null) return confProp;
		else throw new RuntimeException("The property \"" + propName + "\" is not found in config.properties file");
	}
	
}
